import java.lang.reflect.Array;
import java.util.*;

public class AdjList {
    // A=>B, B=>C, B=>E, C=>E, E=>D
    public static Map<String, ArrayList<String>> buildAdj() { // build a adjacent list for a graph
        Map<String, ArrayList<String>> adjList = new HashMap<>();
        // given input
        String[][] edges = {{"A","E"},{"A","B"},{"B","C"},{"B","E"},{"C","E"},{"E","D"}};
        Set<String> visit = new HashSet<>();

        for (String[] edge:edges) { // all vertices connecting to own edges
            String src = edge[0]; String dst = edge[1];
            if (!adjList.containsKey(src)) adjList.put(src, new ArrayList<>());
            if (!adjList.containsKey(dst)) adjList.put(dst, new ArrayList<>());
            adjList.get(src).add(dst);
        }
        System.out.println(dfs("A","E", adjList, visit));
        System.out.println(bfs("A","E", adjList));
        return adjList;
    }

    // Count how many paths to get to the destination from the source
    public static int dfs(String node, String target, Map<String, ArrayList<String>> adjList, Set<String> visit) {
        if (node.equals(target)) return 1;
        if (visit.contains(node)) return 0;

        visit = new HashSet<>();
        visit.add(node);
        int count = 0;
        for (String neighbor:adjList.get(node)) {
            count += dfs(neighbor, target, adjList, visit);
        }
        visit.remove(node);
        return count;
    }

    // return the shortest path length taken
    public static int bfs(String node, String target, Map<String, ArrayList<String>> adjList) {
        int length = 0;
        Deque<String> queue = new ArrayDeque<>();
        Set<String> visit = new HashSet<>();
        queue.add(node);
        visit.add(node);

        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                String curr = queue.peek();
                queue.remove();
                if (curr.equals(target)) return length;
                for (String neighbor:adjList.get(curr)) {
                    if (!visit.contains(neighbor)) {
                        visit.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(buildAdj());
    }
}

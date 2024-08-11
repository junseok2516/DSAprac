/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/


import java.lang.reflect.Array;
import java.util.*;

public class CloneGraph133  {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    Map<Integer, Node> adjList;
    public Node cloneGraph(Node node) {
        adjList = new HashMap<>();
        return clone(node);
    }

    Node clone(Node node) {
        if (node == null) return null;
        if (adjList.containsKey(node.val)) return adjList.get(node.val);

        Node newNode = new Node(node.val, new ArrayList<Node>());
        adjList.put(newNode.val, newNode);
        for (Node neighbor:node.neighbors) {
            newNode.neighbors.add(clone(neighbor));
        }
        return newNode;
    }
}

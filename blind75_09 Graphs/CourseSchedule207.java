import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseSchedule207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] adjList = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++) {
            adjList[i] = new ArrayList();
        }

        boolean[] visit = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            adjList[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if(!dfs(adjList, visit, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(ArrayList[] adjList, boolean[] visit, int course) {
        if (visit[course]) {
            return false;
        } else {
            visit[course] = true;
        }

        for (int i = 0; i < adjList[course].size(); i++) {
            if(!dfs(adjList,visit, (Integer) adjList[course].get(i))) {
                return false;
            }
        }
        visit[course] = false;
        return true;
    }
}

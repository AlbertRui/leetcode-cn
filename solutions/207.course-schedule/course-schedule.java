class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] neigh = new LinkedList[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++) neigh[i] = new LinkedList<>();
        for(int[] pair : prerequisites) {
            neigh[pair[1]].add(pair[0]);
            indegree[pair[0]]++;
        }
        for(int i = 0; i < indegree.length; i++)
            if(indegree[i] == 0) queue.offer(i);
        int count = 0;
        while(!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for(int adj : neigh[course]) 
                if(--indegree[adj] == 0) queue.offer(adj);
        }
        return count == numCourses;
    }
}
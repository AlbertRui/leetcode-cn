class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1) return Collections.singletonList(0);
        List<Set<Integer>> adj = new ArrayList<>(n);
        for(int i = 0; i < n; i++) adj.add(new HashSet<>());
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> leaves = new LinkedList<>();
        for(int i = 0; i < n; i++) 
            if(adj.get(i).size() == 1) leaves.add(i);
        while(n > 2) {
            n -= leaves.size();
            for(int j = leaves.size(); j > 0; j--) {
                int leaveNum = leaves.remove();
                int leaveRoot = adj.get(leaveNum).iterator().next();
                adj.get(leaveRoot).remove(leaveNum);
                if(adj.get(leaveRoot).size() == 1) leaves.add(leaveRoot); 
            }
        }
        return new ArrayList<>(leaves);
    }
}
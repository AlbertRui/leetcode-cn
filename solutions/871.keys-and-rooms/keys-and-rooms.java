class Solution {
    private boolean[] visited;;
    private int count = 0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int num = rooms.size();
        visited = new boolean[num];
        dfs(rooms, 0);
        return count == num;
    }
    private void dfs(List<List<Integer>> rooms, int room){
        visited[room] = true;
        count++;
        for(int key : rooms.get(room))
            if(!visited[key]) dfs(rooms, key);
    }
}
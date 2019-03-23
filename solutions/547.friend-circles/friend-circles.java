class Solution {
   class UnionFind {
       private int count = 0;
       private int[] parent, rank;
       public UnionFind(int n) {
           count = n;
           parent = new int[n];
           rank = new int[n];
           for(int i = 0; i < n; i++) 
               parent[i] = i;
       }
       private int find(int p) {
           while(p != parent[p]) 
               p = parent[p];
           return p;
       } 
       public void union(int p, int q) {
           int pRoot = find(p);
           int qRoot = find(q);
           if(pRoot == qRoot) return;
           if(rank[pRoot] > rank[qRoot])
               parent[qRoot] = pRoot;
           else {
               parent[pRoot] = qRoot;
               if(rank[pRoot] == rank[qRoot])
                   rank[qRoot]++;
           }
           count--;
       }
       public int count() {
           return count;
       }
   }
    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) 
            for (int j = i + 1; j < n; j++) 
                if (M[i][j] == 1) uf.union(i, j);
        return uf.count();
    }
}
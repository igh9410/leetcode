class Solution {
    

    
    public int[] findRedundantConnection(int[][] edges) {
        
        int n = edges.length;
        
        UnionFind uf = new UnionFind(n);
        
        for (int[] edge: edges) {
            if (!uf.connected(edge[0] - 1, edge[1] - 1)) {
                uf.union(edge[0] - 1, edge[1] - 1);
            } else {
                return edge;
            }
        }
        throw new AssertionError();      
      
        
    }
    
        public class UnionFind {
        
        private int size;
        
        private int[] id;
        private int[] sz;
        
        private int numComponents;
        
        public UnionFind(int size) {
            
            if (size <= 0) {
                throw new IllegalArgumentException("Size Error");
            }
            
            this.size = numComponents = size;
            
            id = new int[size];
            sz = new int[size];
            
            for (int i = 0; i < size; i++) {
                id[i] = i;
                sz[i] = 1;
            }            
        }
        
        public int find(int p) {
            
            int root = p;
            
            while (root != id[root]) {
                root = id[root];
            }
            
            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }
            
            return root;
        }
        
        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }
        
        public void union(int p, int q) {
            
            if (find(p) == find(q)) {
                return;
            }
            
            int root1 = find(p);
            int root2 = find(q);
            
            if (sz[root1] < sz[root2]) {
                sz[root2] += sz[root1];
                id[root1] = root2;
                sz[root1] = 0;                
            }
            else {
                sz[root1] += sz[root2];
                id[root2] = root1;
                sz[root2] = 0;
            }
            numComponents--;
            
        }
        
        public int size() {
            return size;
        }
        
        public int components() {
            return numComponents;
        }
            

        
    }
}
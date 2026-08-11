// Last updated: 8/11/2026, 2:14:50 PM
class Solution {
    List<Integer>[] tree;
    int[] base;
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        tree = new ArrayList[n];
        for(int i=0;i<n;i++) tree[i]=new ArrayList<>();
        for(int[] e : edges){
            tree[e[0]].add(e[1]);
        }
        base = baseTime;
        return dfs(0);
        
    }
    private long dfs(int node){
        if(tree[node].isEmpty()){
            return base[node];
        }
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int child : tree[node]){
            long t = dfs(child);
            min = Math.min(min,t);
            max = Math.max(max,t);
        }
        return max+(max-min)+base[node];
    }
}
import java.util.ArrayList;

public class dfsOnGraph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        return dfsHelper(V,0,vis,adj,new ArrayList<Integer>());
    }
    public static ArrayList<Integer> dfsHelper(int V,int src,boolean[] vis ,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs){
        vis[src] = true;
        dfs.add(src);
        for(int i : adj.get(src)){
            if(!vis[i]){
                dfsHelper(V,i,vis,adj,dfs);
            }
        }
        return dfs;
    }
}

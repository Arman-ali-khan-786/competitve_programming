import java.util.ArrayList;

public class toDetectCycleInDigraph {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        for(int i = 0 ; i< V ; i++){
            if(isCyclicHelper(vis,rec,adj,i)) return true;
        }
        return false;
    }
    public boolean isCyclicHelper(boolean[] vis,boolean[] rec, ArrayList<ArrayList<Integer>> adj,int src){
        if(rec[src]) return true;
        if(vis[src]) return false;
        
        vis[src] = true;
        rec[src] = true;
        for(int ele : adj.get(src)){
            if(isCyclicHelper(vis,rec,adj,ele)) return true;
        }
        rec[src] = false;
        return false;
    }
}

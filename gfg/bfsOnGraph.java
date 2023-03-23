import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsOnGraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        q.offer(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int ele = q.poll();
            bfs.add(ele);
            for(int i : adj.get(ele)){
                if(!vis[i]){
                    vis[i]=true;
                    q.offer(i);
                }
            }
        }
        return bfs;
    }
}

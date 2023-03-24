import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class topologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> stk = new Stack<>();
        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);
        for(int i = 0 ;i < V ;i++){
            if(!vis[i]){
                topoSortUtil(vis,i,adj,stk);
            }
        }
        int ans[] = new int[V];
        int i = 0;
        while(!stk.isEmpty()){
            int ele = stk.pop();
            ans[i++] = ele;
        }
        return ans;
    }
    static Stack<Integer> topoSortUtil(boolean []vis,int src, ArrayList<ArrayList<Integer>> adj,Stack<Integer> stk){
        vis[src] = true;
        for(int ele:adj.get(src)){
            if(!vis[ele]){
                topoSortUtil(vis,ele,adj,stk);
            }
        }
        stk.push(src);
        return stk;
    } 
}

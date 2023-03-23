import java.util.ArrayList;

// Given the adjacency list of a bidirectional graph. Your task is to copy/clone the adjacency list 
// for each vertex and return a new list.



public class copyAdjacencyList {
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<ArrayList<Integer>> adj2= new ArrayList<>();
        for(int i = 0 ; i < V ; i++){
            adj2.add(new ArrayList<>());
        }
        for(int i =0 ; i<V ; i++){
                adj2.get(i).add(i);
                for(int k: adj.get(i)){
                     adj2.get(i).add(k);
                }
        }
        return adj2;
    }
}

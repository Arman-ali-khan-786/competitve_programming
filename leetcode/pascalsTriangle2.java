/*

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle


*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        f.add(1);
        if(rowIndex == 0) return f;
        res.add(f);
        for(int i = 1 ; i<=rowIndex ;i++){
            ArrayList<Integer> h = new ArrayList<>();
            h.add(1);
            List<Integer> prev = res.get(i-1);
            for(int j = 1 ; j<prev.size() ; j++){
                h.add(prev.get(j-1)+prev.get(j));
            }
            h.add(1);
            res.add(h);
        }
        return res.get(res.size()-1);
        
    }
}

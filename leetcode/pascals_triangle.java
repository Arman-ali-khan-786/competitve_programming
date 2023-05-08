class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<Integer>();
        f.add(1);
        res.add(f);
        // System.out.println(ans);
        for(int i = 1 ; i<numRows ; i++){
            ArrayList<Integer> h = new ArrayList<>();
            h.add(1);
            List<Integer> prev = res.get(i-1);
            for(int j = 1 ; j<prev.size() ;j++){
                h.add(prev.get(j-1)+prev.get(j));
            }
            h.add(1);
            res.add(h);
        }
        return res;
    }
}

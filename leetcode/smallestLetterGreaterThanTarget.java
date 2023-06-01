class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s =0 , e = letters.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target >= letters[mid]) s=mid+1;
            else e=mid-1;
            // else return letters[(mid+1)%letters.length];
        }
        return letters[s%letters.length];
    }
}

date : 8/6/23
/*Given a number N, find the least prime factors for all numbers from 1 to N.  The least prime factor of an integer X is the smallest prime number that divides it*/

class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int arr[] = new int[n+1];
        arr[1] = 1;
        for(int i = 2 ; i<=n ; i++){
            if(arr[i] == 0){
                arr[i] = i;
                for(int j = i*i ; j<=n ; j+=i){
                    if(arr[j] == 0)  arr[j] = i;
                }
            }
        }
        return arr;
    }
}

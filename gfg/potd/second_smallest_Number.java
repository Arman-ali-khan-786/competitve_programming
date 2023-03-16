//############################# PROBLEM OF THE DAY - 16th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

// ***************************************** Question : ************************************************
// The task is to find the second smallest number with a given sum of digits as S and the number of digits as D.
// Example 1:

// Input:
// S = 9 
// D = 2
// Output:
// 27
// Explanation:
// 18 is the smallest number possible with sum = 9
// and total digits = 2, Whereas the second
// smallest is 27.
// Example 2:

// Input:
// S = 16
// D = 3
// Output:
// 178
// Explanation:
// 169 is the smallest number possible with sum is
// 16 and total digits = 3, Whereas the second
// smallest is 178.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function secondSmallest() which takes the two integers S and D respectively and returns a string which is the second smallest number if possible, else return "-1".

// Expected Time Complexity: O(D)
// Expected Space Complexity: O(1)

// Constraints:
// 1 ≤ S ≤ 105
// 1 ≤ D ≤ 105


package potd;
class solution{

// -----------------this was my 1st approach out of  1115 testcases it passed 1110 testcases

    // public static long sumDigit(double n){
    //     long sum =0;
    //     while(n>0){
    //         Double rem = n%10;
    //         sum+=rem;
    //         n/=10;
    //     }
    //     return sum;
    // }
    // static String secondSmallest(int S, int D){
    //     // code here
    //     int c=0;
    //     String res ="";
    //     double start=Math.pow(10, D-1);
    //     System.out.println(start);
    //     double end = start*10;
    //     while(start++ < end){
    //         if(c==2){
    //             break;
    //         }else{
    //             if(sumDigit(start)== S){
    //              c++;
    //              int st = (int)(start);
    //              res=""+st;
    //             }
    //         }    
    //     }
    //     return res;
    // }

// ----------------> modified approach 
static String secondSmallest(int S, int D){
    // code here
    if(D==1||S==1||S>=9*D){
        return "-1";
    }
    boolean check = false;
    StringBuilder sb = new StringBuilder();
    for(int i =0 ; i<D ; i++){
        int digit;
        if(S>9){
            digit=9;
            S-=9;
        }else{
            if(i==D-1){
                digit=S;
            }else{
                if(S>1){
                    digit=S-1;
                    S=1;
                }else{
                    digit=0;
                }
            }
        }
        if(!check && digit<9 && sb.length()>0){
            digit++;
            char ch = sb.charAt(sb.length()-1);
            sb.setCharAt(sb.length()-1,--ch);
            check=true;
        }
        sb.append(digit);
    }
    
    return sb.reverse().toString();
    
}
    public static void main(String[] args) {
        // int sum = 9, Digit = 2;  // 1st testcase
        int sum = 69874,Digit=79636; // 1111th testcase where i was stuck for appox 2hrs
        System.out.println(secondSmallest(sum, Digit));
        
    }
}

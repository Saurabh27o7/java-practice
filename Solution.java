//  import java.util.Arrays;
//  public class Solution {
//     public static void main(String[] args) {
//         int [] nums={2,7,9,10};
//         int target=12;
//         int []ans=twoSum(nums,target);
//         System.out.println(Arrays.toString(ans));
//     }
//     public static int[] twoSum(int[] nums, int target) {

//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]+nums[j]==target)
//                 {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[] {-1, -1};
//     }
// }





//hackerrank 
// import java.util.*;
// import java.io.*;

// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//             System.out.println();
//         }
//         in.close();
//         int q;
//         for(int i =0;i<n;i++){
//             q= a+t^i*b;
//             System.out.print("("+q+"),");
                        
            
            
            
//         }
//     }
// }



import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if (x>=-32768 && x<=32767) System.out.println("* short");
                if (x>=-Math.pow(2,31) &&  x<=Math.pow(2,31)-1) System.out.println("* int");
                if (x>=-Math.pow(2,63) &&  x<=Math.pow(2,63)-1)  System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


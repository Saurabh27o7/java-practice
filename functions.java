import java.util.Scanner;
public class functions{
    public static void main (String args[]){

  

        Scanner sc= new Scanner(System.in);

    //1. printMyName("saurabh Patil");    


    //2.  function call to calculate average of 3 numbers
        // System.out.println("enter first no.");
       /* int p= sc.nextInt();  // ..........................................(used in function 3,4)
        int q= sc.nextInt();  //...........................................(used in function 4)
        int r= sc.nextInt();
        calculateAverage(p,q,r);  */


    //3.  function to calculate sum of n odd numers
       // sumOfOdd(p);

    //4.  function to print greater number betweeen two numbers
        // greaterNo(p,q);

    //5. printing fibonacci series
      fibonnacci(10);

    }

    // functions
// returntype functionName (datatupe args){ operation }

    public static void printMyName (String name ){
    System.out.println(name);
  
     return;
    }

    public static void calculateAverage(int a,int b,int c){
        int Avg=  (a+b+c)/3;
        System.out.println("Avg is :"+ Avg);
    }

    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public static void greaterNo(int a,int b){
        if(a>b){
            System.out.println(a + " is greater");
        }
        else{
            System.out.println(b+ " is greater");
        }
    }

    public static void fibonnacci(int n){
        int sum, a= 0, b=1;
        for (int i=0;i<=n;i++){
            sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum + " ");
        }
    }

   


    }

    
    







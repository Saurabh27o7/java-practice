import java.util.Scanner;
import java.util.Arrays;


public class sorting {

    // Bubble sorting
    // Insertion sorting
    // Selection sorting
    
    
    public static void main(String args[]){
        
    //     Scanner sc = new Scanner(System.in);

    //     int arr1 []= new int [10];
    //     for (int i=0; i<arr1.length;i++){
    //         arr1[i]= sc.nextInt();
            
    //     }
       
    //     // System.out.println();
        
    //     // for(int i=0;i<arr1.length;i++){
    //     //     System.out.print(arr1[i]+ " ");
    //     // }

    //     // System.out.println(Arrays.toString(arr1));

    //     for (int i=0;i<arr1.length-1;i++){
    //         for (int j=0;j<arr1.length-1-i;j++){
    //             if (arr1[j]>arr1[j+1]){
    //                 int temp= arr1[j];
    //                 arr1[j]= arr1[j+1];
    //                 arr1[j+1]= temp; 
      
    //             //swap

    //             }

    //         }
    //     } 
    //     System.out.println(Arrays.toString (arr1));
             

    //selection sort

    // int arr []= {1,4,37,2,9};

    // for (int i=0; i<arr.length-1;i++){
    //     int smallest = i;
    //     for (int j=i+1;j<arr.length;j++){
    //        if (arr[smallest]>arr[j]){
    //            smallest = j;
    //        }
    //     }
    //            int temp = arr[i];
    //            arr[i]= arr[smallest];
    //            arr [smallest]= temp;
           
           
            
        
        
    // }
    // System.out.println(Arrays.toString(arr));



    

    // insretion sort

    int arr[]= {1,9,8,4,2};
    
for(int i=1;i<arr.length;i++){
    int current= arr[i];
    int j;
    for ( j=i-1 ;j>=0 && current < arr [j];j--){
        
            arr [j +1]= arr[j];
      
    

}
arr [j+1]= current;
}
System.out.println(Arrays.toString(arr));



    




    }
}

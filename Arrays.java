import java.util.Scanner;
public class Arrays {
   


    public static void main (String args[]){
   int marks []= new int [5];
    // int marks [] = {23,30,32,42,55};
    marks[0]= 30;
    marks[1]= 28;
    marks[2]= 22;
    marks[3]= 25;
    marks[4]= 26;


    // int i=0;
    // while(i<6){
    //     System.out.println(marks[i]);
    //     i++;
    //}


//1.  take an array input from user && print the index of given number x 

Scanner sc = new Scanner (System.in);
    // int size = sc.nextInt(); 
    // int numbers[] = new int [size];


    // for (int i=0; i<size; i++){
    //     numbers[i]= sc.nextInt();
     
    // }
    
    // int x= sc.nextInt();
    // for (int i =0; i<size ;i++ ){
    //     if( numbers[i]==x)
    //     System.out.println(i);
    // }


// 2D Arrays 

// int rows = sc.nextInt();
// int column = sc.nextInt();
// int twod_arrays [][]= new int [rows][column];

// for (int i= 0; i< rows; i++){
//    for (int j= 0; j< column; j++) {
//     twod_arrays [i] [j] = sc.nextInt();
      
//    }

// }

// for (int i= 0; i< rows; i++){
//     for (int j= 0; j< column; j++) {
//     System.out.print(twod_arrays[i][j] + "  ");
       
//     }
//     System.out.println();
    
// }



//print the transpose of n*m matrix

int matrix [][] = new int [3][3];

for (int i=0;i<3; i++){
    for (int j= 0;j<3;j++ ){
        matrix[i][j]=sc.nextInt();

    }
}


for (int i=0;i<3; i++){
    for (int j= 0;j<3;j++ ){
       System.out.print(matrix [i][j]);
       
    }
    System.out.println();
}

System.out.println("transpose of a matrix is :");

for (int j=0;j<3; j++){
    for (int i= 0;i<3;i++ ){
       System.out.print(matrix [i][j]+ " ");
       
    }
    System.out.println();
}






    }

    public static char[] toString(int[] ans) {
        return null;
    }

}

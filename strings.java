import java.util.*;
public class strings {

    //properties of strings 
     //1. concatinations ... strings are combined using +

     //2. .lenghth() method ids used to calculate length of string 

     //3.  .charAt method is used to print the string at index i 
     
     //4. .compareTo returns 0 if string is equal,+ve if greater else -ve
     
     //5. .substring(x,y) is used to cut/take string from othrer string
     
     //6. strings are immutable  Hence we use Stringbuilder

     
     public static void main(String args []){

     //    String Name = "SAURABH" ;
     //    String Name2 = "PATIL";
    
     //    System.out.println(Name.charAt(0));                       // charAt
     //    System.out.println((Name.compareTo(Name2)));                   // compareTo


     //    // parseInt method of intiger class
        
     //    StringBuilder sb = new StringBuilder("Saurabh patil");
     //      System.out.println(sb);

         // setcharAt(index, "x")
         // insert (index, "x")
         // delete (index, index)
         // append ("any string")   
          // above methods and all methods of strings can be used in string builder    


          // printf method for strinng formatting in java 
          int n= 3;
          String s= "Saurabh";
          float f = 10.3f;

          System.out.printf(" Id = %03d %n Name = %-8s  %n salary is %.3f", n,s,f);

     }
    
}

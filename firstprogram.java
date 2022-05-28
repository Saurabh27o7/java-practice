import java.util.Scanner;
class firstprogram{
    

    //output
    public static void main (String args[]){
    System.out.println("hello"); 


    //variables 
    // datatype variable  name =




    //taking input

    Scanner  obj = new Scanner(System.in);

    /*System.out.println("enter num 1: ");
    
    int num1 = obj.nextInt();

    System.out.println("enter num2 : ");
    int num2 = obj.nextInt();

    int add = num1+num2;
    System.out.print("sum is: ");
    System.out.println(add);


    String name = obj.nextLine();

    System.out.println(name);




     //if else 
     //nested if else
    // if elseif else
     //  System.out.println("not born");
       //else {
         // System.out.println("adult");
      //}
      */

   

   //switch case 
   int button= obj.nextInt();
   switch(button){
       case 1: System.out.println("hello");
       break;

       case 2:System.out.println("hii");
       break;
       default : System.out.println("invalid");


   }


   // OPERATORS

// Types of Opetaators

// Arithmetic Operator
// Shift Operator
// Relational Operator
// Bitwise Operator
// Logical Operator
// Ternary Operator 
// Assignment Operator



    //BASICS: 

        // new keyword is used for defining space in memory for any vaariable or non primitive datatype
        // int is of 4 bytes
        //1 box of address of array is 1 byte  therefore int required four boxes
        // .length  is used to know the size of array 

        // .hasNext() method is used to know if next token is present in input , returns true if next input is present 


    }
}




// INPUT METHODS

// nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user
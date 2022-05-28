

public class Oop {
    public static void main(String args[]){

        Student S1 = new Student();
        Student S2 = new Student();

        
        S1.Name= "Raj";
        S1.Roll_no= 3;
        S1.mobile_no= 1213412;

        S2.Name= "Ram";
        S2.Roll_no= 35;
        S2.mobile_no= 333444;
        
       

        S1.printdetails();
        S2.printdetails();

        Cars c1 = new Cars("bmw","gt",1000000000);
        
    }
}
    

class Student{
    int Roll_no;
    String Name ;
    int mobile_no;

    // Student(){
    //     System.out.println("constructor called");
    
    //  Paramitarized constructors
    //  copy constructor
  

    public void printdetails(){
        System.out.println("   ROLL NO : "+this.Roll_no + "\n  Name: "+ this.Name+ " \n MObile no: "+ this.mobile_no);
    }
}

 
class Cars{
    String car_name;
    String model_name;
    int price;
   
   
    Cars( String car_name , String model_name, int price ){
         this.car_name= car_name;
         this.model_name = model_name;
         this.price= price;
         System.out.println(this.car_name + "\n"+ this.model_name + "\n" + this.price);
    }

    }
   



    

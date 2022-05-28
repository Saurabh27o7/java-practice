public class Oop2 {

    // polymorphism 
// Compile time polymoorphism  (FUNCTION OVERLOADDING)
    // diffferent functions with same name

    

public static void main(String args[]){
// Students1 S1 = new Students1();
// Students1 S2= new Students1();

// S1.printrollmobile(3,8349983);
// S2.printrollmobile(5);




Triangle T1 = new Triangle();

T1.area(5,5);
T1.area();

}
}

class Students1{
   
    public static void printrollmobile(int ROllno) {
        System.out.println(ROllno);
        
    }
    public static void printrollmobile(int ROllno,int mobileno) {
        System.out.println(ROllno+" "+ mobileno);
        
    }
}


// INHERITANCE 

class Shape{
   public void area(){
        System.out.println(" Display area");
    }
}

class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println(0.5 *l* b);
        
    }
}



//packages

// Access modifiers 4 types
//1. Public : can be accessed everywhere in any packages
//2. Default : can be accessed only in one's particular packages
//3. Protected : can be accessed in the same packages as well in the sub classes of other packaes
//4. private : can not be accessed in the any other class.
         //   if needs to accesss, we can access indirectly through getters and setters

// ENCAPSULATION : Combining data and functions in one unit i.e class
                   // data hiding can be done using encapsulation using access modifir

// ABSTRACTION : 
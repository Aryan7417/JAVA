// public class zoops {

//     public static void main(String[] args){

//         Dog d1 =new Dog();                          
//         d1.name="aryan";  
//         d1.bark();
//         d1.walk();

//         Dog d2 = new Dog();
//         d2.name="tomy";
//         d2.bark();
//         d2.walk();
//         Complex num1=new Complex();
//         num1.a=8;
//         num1.b=5;
//         num1.print();

//     }
    
// }

// class Complex{

//     int a,b;
//     void print() {
//         System.out.println(a+" + "+b+"i");
//     }
// }

// class Dog {
//     String name;
    
//     int age;

//     String color;


//     void walk(){
//         System.out.println(name + "is walking");
//     }

//     void bark(){

//         System.out.println(name + " is barking");
//     }

// }
// ------------------------------------------------------------------------------------------------------


//--------------method overloading------------
// public class zoops {

//     public static void main(String[] args) {
//         Greet obj = new Greet();
//         // obj.greetings();
//         // obj.greetings("Aryan");

//         obj.greetings("aryan", 5);
//     }
// }

// class Greet{
//     void greetings(){
//         System.out.println("hello good moring");
//     }

//     void greetings(String name){
//         System.out.println("hello "+ name +" Good Morning");
//     }

//     void greetings(String name , int count){
//         for (int i = 0 ;i<count;i++){
//             System.out.println("hello "+ name  +" good Morning");
//         }
//             }
// }

//-----------------------------------------------------------------------------------------------------------------------


//-----------------------------------------Constructors--------------------------------------

// public class 4zoops {

//      public static void main(String[] args) {
//         Complex num1 = new Complex();
//         Complex num2=new Complex(3,5);
//         num1.print();
//         num2.print();
        
//      }
// }
// class Complex{
//     int a ,b ;


//     public Complex(){
//         a=9;
//         b=6;
//         System.out.println("Creating a new Object");
//     }
//     public Complex(int real, int imagenary){
//         a=real;
//         b=imagenary;
//     }

//     void print(){
//         System.out.println(a+ " + "+b+"i");
//     }
// }























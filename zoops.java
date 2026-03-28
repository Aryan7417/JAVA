public class zoops {

    public static void main(String[] args){

        Dog d1 =new Dog();                          
        d1.name="aryan";  
        d1.bark();
        d1.walk();

        Dog d2 = new Dog();
        d2.name="tomy";
        d2.bark();
        d2.walk();
        Complex num1=new Complex();
        num1.a=8;
        num1.b=5;
        num1.print();

    }
    
}

class Complex{

    int a,b;
    void print() {
        System.out.println(a+" + "+b+"i");
    }
}

class Dog {
    String name;
    
    int age;

    String color;


    void walk(){
        System.out.println(name + "is walking");
    }

    void bark(){

        System.out.println(name + " is barking");
    }

}

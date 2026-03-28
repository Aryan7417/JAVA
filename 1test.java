// -----------------------------------------------------introduction-----------------------------------------------------------------
// ----------------------------syntex------------------------------------
// public class test{
// public static void main(String[] args){
// System.out.println("x ::HELLO WORLD!!");
// System.out.println(4+8);
// System.out.println(23+32+23+44);
// }

// }
// ---------------------------------------------------------------------------------------------------------------------------------

// java Variable

// public class test{
// public static void main(String[] args){
// int age = 23;
// int marks=29;
// int aryanYadav=89;
// int Name=aryanYadav;

// System.out.println(aryanYadav);

// }
// }

// ------------------------------------------------------------------------------------------------------------------------------------

// java data Type

// int=4byte-----   float=4byte----   char=2byte----   boolean=1bit----     byte=1byte/8bit---     short=2byte---  long=8byte/64bits----    double=8byte/65bits ------

// public class test{
//     public static void main(String[] args){
//         int clount=12;
//         byte marks=13;
//         short students=121;
//         float pi=3.12f;
//         double hey=12.232323;
//         boolean tr=true;
//         long lo=21313882;
//         char a= 'A';  //use only single charater



//         System.out.println(clount);
//         System.out.println(marks);
//         System.out.println(tr);
//         System.out.println(pi);
//         System.out.println(a);
//         System.out.println(hey);
//         System.out.println(a);
//     }
// }



// --------------------data type implicit conversion-----------------
// public class test{
//     public static void main(String[] args){

//         int clount=34232413;
//         long countlong=(long)clount;

//         System.out.println(countlong);
//     }

// }//---------------------------------------------------------------------------------------------------------------------------------------------------------------

//Operation in java

//Arithmetic operator


// public class test{

//     public static void main(String[] args){
//         //Arithmetic operator
//         // int a= 12;
//         // int b= 7;
//         // int c= a+b;
//         // int d=a-c;
//         // int f =a/b;
//         // int e=a*b;
//         // int g=a%b;  // show reminder
//         // //==============Assignamnet operrator==================
//         // let a=23;
//         // let b=4;
//         // a=b;
//         // a-=b;-->a=a-b
//         // a+b;--->a=a+b
//         //=================relational operator====================

//         // int a=213;
//         // int  b=32;


//         // System.out.println(c);
//         // System.out.println(d);
//         // System.out.println(e);
//         // System.out.println(f);
//         // System.out.println(g);

//         // System.out.println(b==a);
//         // System.out.println(b!=a);
//         // System.out.println(b>a);
//         // System.out.println(b<a);
//         // System.out.println(b>=a);
//         // System.out.println(b<=a);
//         //=============logicla operator================
//         // boolean a=false;
//         // boolean b=true;
//         //  System.out.println(b  && a);
//         //  System.out.println(b  || a);
//         //  System.out.println(!a );
//         //=========incriment and decriment operator======
//         // int a=2;
//         // int b=123;
//         // a++;
//         // b--;
//         // System.out.println(b);
//         //

    


//     }
// }

//--------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------this statement used for input using user -------------------
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         //System.out.println("enetr your age");
//        // int age =sc.nextInt();
//      //   System.out.println("your age is "+age);

//      System.out.print("Enter 1st number");
//      int a=sc.nextInt();
//      System.out.print("Enter 2st number");
//      int b=sc.nextInt();
//      int resut=a+b;
//      System.out.println("result: "+resut);   
   
//     }
// }

//--------------------------------------------------------------------------------------------------------

//---------------------------------Conditional statment ----------------------
// import java.util.Scanner;
// public class test{
//    public static void main(String[] args){

//     int age=32;
//     if(age>=18){
//         System.out.println("You Can Vote");
//     }
//     else{
//         System.out.println("You are not eligible to vote");
//     }
//    }
//
// }
 //-------------(if) (elese If)  (else)--------------

// public class test {
//     public static void main(String[] args){
//         int day =31;
//         if (day==1){
//             System.out.println("Go to home");
//         }
//         else if(day==3){
//             System.out.println("Go to party");
//         }
//         else{
//             System.out.println("GO to office");
//         }
    
    
//     }

    
// }

// //----------------------- nested if-else Statement-----------------------

// public class test {
//     public static void main(String[] args){

//         int a=23;
//         int b=3;
//         int c=1;

//         if(a>b){
//             System.out.println("A is biggger then b");
//             if(a>c){
//                 System.out.println("A is biggger then b");
//                 System.out.println("SO A is gratest"+b);
//             }
//             else{
//                 System.out.println("c is biggest");
//                 System.out.println("C is largest"+c);
//             }
//         }
//         else{
//             System.out.println("b is biggest");
//             if(b>c){
//                 System.out.println("b is biggesr then c");
//             }
//             else{
//                 System.out.println("c is bigger then b");
//                 System.out.println("c is largest "+c);
//             }
//         }
//     }
// }


























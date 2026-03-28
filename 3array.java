//Array in JAVA 

//-------------------------------------------------------------------------------------------------------------------------
// public class aarray {
//     public static void main(String[] args){
//         //int age[];//decleration

//         //age=new int[5];//allocation

//         // int age[]=new int[7];
//         // System.out.println(age.length);     //lemngth of array



//         // int marks[]={23, 43, 56, 76, 87};

//         // System.out.println(marks[2]);


//         String names[] = {"Aryan","Khushi","Tanishka","radhika"};

//         for(int i = 0; i<names.length;i++){
//             System.out.println("nema is "+names[i]);
//         }


//         for(String name:names){
//             System.out.println(name);
//         }


    
        
//     }
    
// }

//---------------------------------------------------single  dimesnattion array -------------------------------------------------------------------

// public class aarray{
//     public static void main(String[] args){
//         int nums[]={23,43,354,34,56,78};
//         // int sum=0;
//         // for(int num:nums){
//         //     sum+=num;
//         // }
//         // System.out.println("Sum is = "+sum);

//         int min=Integer.MAX_VALUE;

//         for(int num:nums){
//             if (num<min){
//                 min=num;
//             }
            
//         }
//         System.out.println(min);
    
//     }
// }

//X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X--X-X-X-X--X-X-X--X-X-X--X-X--X-X-X-X-X-X--X-X-X--X



//--------------------------------- MULTIDIMENTATIONAL ARRAY--------------------------------------------------------------------

// //2 D ARRAY  = MATRIX
// public class aarray{
//     public static void main(String[] args){
//         int marsk[][]={
//             {12,23,34},
//             {65,56,56},
//             {32,54,64},
//             {67,67,78}
//         };

//         System.out.println(marsk[2][0]);//32
//         System.out.println(marsk[1][1]);//56
//         System.out.println(marsk[2][1]);//54
        
//         //----2nd Method--------
//         // marsk[0][0]=12;
//         // marsk[0][1]=23;
//         // marsk[0][2]=34;

//         // marsk[1][0]=23;
//         // marsk[1][1]=50;
//         // marsk[1][2]=67;


//         // marsk[2][0]=65;
//         // marsk[2][1]=56;
//         // marsk[2][2]=54;


//         // marsk[3][0]=67;
//         // marsk[3][1]=89;
//         // marsk[3][2]=29;



//     }

// }
//----------------------------------------------------Method/function  in java--------------------------------------------------------------------
//defination->A method is a block of code or collection of statement or a set of code grouped together  to perform a certain
//task ort operation it is used to to achiver the reudability of code

// public class aarray {

//     public static void main(String[] args) {
//         int averafunction=average(3,5,false);
//         System.out.println("hello ");
//         int averafunction1=average(3, 129,true );
//         System.out.println(averafunction);

        
        
//     }
//     public static int average(int a , int b ,boolean shouldAverage){
//         int avg=(a+b)/2;
//         // System.out.println("The Average Of two number :"+avg);
//         return avg;
//     }
    
// }
//-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x--x---x---x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x---x-x-x-x-x-x-x-x-x-x-x-x-x-x-



//calling of a method
// public class urray{
//   public static void main(String[] args){
//     System.out.println("Hiii Radhika");
//     greet();
//     System.out.println("but i not try radhika");
    
//   }

//    static void greet(){
//     System.out.println("radhiks seens me");
//   }

// }

//X-X-X-X-X-X-X-X-XX--X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X--X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X

//learn math Method

// public class urray{

//   public static void main(String[] args){

//     int a =23;
//     int b=45;

//     System.out.println(Math.min(a,b));
//     System.out.println(Math.sqrt(12));
//     System.out.println(Math.pow(3,5));
//     System.out.println(Math.abs(-3));
//     System.out.println(Math.random());
//     System.out.println(Random(23,34));
//     System.out.println(Math.floor(5.9));
//     System.out.println(Math.ceil(5.9));
//     System.out.println(Math.round(5.12));

//   }

//   public static int Random(int a , int b){
//     // return (int) (Math.random()*6+1);
//     return (int ) (Math.random()*(b-a+1)+a);
//   }


// }

//---------------------------------------------------------------------------------------------------------------------


//------------------java String-------------------
//Java String is bascially an object that representy that represent a sequence of char  value.
//  an array ofcharacter works same as java string 

//by String literal 
//by new keyword 

//----------------------String basics-------------------------
//-------------------java string methd-----------


public class urray{
    public static void main(String[] args){
        String name="Aryan        ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("carpate".startsWith("carp") );
        System.out.println(name.endsWith("ba"));
        System.out.println(name.equals("aryan"));

        
    }
}







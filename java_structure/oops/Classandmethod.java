package oops;

public class Classandmethod{
   static void men(){
    System.out.println("hello roshan rauniyar");
   }

   //creating the public static methos
   public void mens(){
    System.out.println("hello chandan sharma ");
   }

   //calling with the main function
   public static void main(String args[]){
    //calling the static method 
    men();
    //calling the public method
    Classandmethod mensss = new Classandmethod();
   mensss.mens();
   }
}

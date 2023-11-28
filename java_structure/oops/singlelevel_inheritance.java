package oops;
import java.util.*;
import oops.bank;
//this is the base class called parent class
class shape {
    public void area(){
        System.out.println("display area");
    }
}


//single level inheritance



class triangle extends shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
} 


//multi level inhertance class

class EquilateralTraiangle extends triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}


//this is called the hierarchial inhertance 
//writing the multiple class extending the parent class

class circle extends EquilateralTraiangle{
    public void areaa(int r){
        System.out.println((3.14) * r*r);
    }
}

public class singlelevel_inheritance {
   public static void main(String args[]){
    //bank.account Account1 = new bank.account();
    //Account1.name = "customers";

    circle newcCircle = new circle();
    newcCircle.areaa(4);
 
   }
    
}

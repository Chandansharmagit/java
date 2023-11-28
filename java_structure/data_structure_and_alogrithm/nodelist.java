package data_structure_and_alogrithm;

import java.util.LinkedList;
import java.util.Scanner;


public class nodelist {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      // Scanner chandans = new Scanner(System.in);
      LinkedList<String> chandan = new LinkedList<String>();
      chandan.add("chandan sharma");
      chandan.add("sharma deepika");

      var getting = chandan.get(0);
      System.out.println(getting);

      System.out.println(chandan);

      chandan.add(0, "chandan deepika");
      chandan.add(1, "lamborghini");
      System.out.println(chandan);

      var getting_size = chandan.size();
      System.out.println(getting_size);

      //for loop

     
      for(int i = 0;i<chandan.size();i++){
        if(chandan.get(i) == "chandan deepika" ){
            System.out.print("( yes found )" );
        }else{
            System.out.print(" not found ");
        }
        System.out.print(chandan.get(i)+ " -> ");
      }

      sc.close();
    }
}

package collections_framework;
import java.util.ArrayList;

public class framwork {
   public static void main(String args[]){
    ArrayList<String> chandan = new ArrayList<>();
    chandan.add("chandan");
    chandan.add("sharma");
    chandan.add("man in the universe");
    chandan.add("welcome to the chadnan sharma zone");

    //removing the data from the arraylist
    chandan.remove(3);
    

    System.out.println(chandan.contains("sharmag"));
    //making the for in loop
   for (String i : chandan) {
    System.out.println(i);
    
   }

   // System.out.println(chandan.get(1));
   } 
}

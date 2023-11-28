package oops;

import java.util.HashMap;

import recursion.sorting;

public class hashset {
    public static void main(String args[]){
      HashMap<String,Integer>maps = new HashMap<>();

      maps.put("arpan gaire", 234233);
      maps.put("samikshaya", 2323422);
      maps.put("deepika dhakal", 9987434);


      maps.put("chandan sharma(ceo)", 273327483);
    

      for (String i : maps.keySet()) {
        System.out.println(i+  " networth " + maps.get(i));
      }
      System.out.println(maps);


    }
}

package oops;

import java.util.*;

import javax.print.attribute.IntegerSyntax;
import java.util.Collections;

public class hashmaps {
    public static void main(String args[]) {
        // creating the hash map
        HashMap<String, Integer> mapset = new HashMap<>();

        // putting the value in the hash map

        mapset.put("lamborghini", 234424676);
        mapset.put("ferrari", 32642364);
        mapset.put("bhugati", 23424343);
        mapset.put("huandai", 3753474);

        // and getting the value

        //and comparing the value with eachother

      


        System.out.println(mapset.get("lamborghini"));
        mapset.remove("huandai");
        System.out.println(mapset);
        System.out.println(mapset.size());

        // usiing for loop over the hash

       for(String i: mapset.keySet()){
        System.out.println( i + " and " + mapset.get(i));
       }
       
    }

    @Override
    public String toString() {
        return "hashmaps []";
    }

}

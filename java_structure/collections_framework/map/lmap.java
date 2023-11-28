package collections_framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class lmap {
    public static void main(String args[]) {
        // Map<String ,Integer>newman = new TreeMap<>();
        // newman.put("one", 1);
        // newman.put("two", 2);
        // newman.put("three", 3);
        // newman.put("four", 4);

        // newman.put("two", 2);

        // if(newman.containsKey("two")){
        // newman.put("two", 34);
        // }

        // System.out.println(newman);

        // System.out.println(newman.keySet());

        // System.out.println(newman.values());

        try {
            Map<String, Integer> maps = new TreeMap<>();

            // adding the valus
            maps.put("chandan sharma", 234);
            maps.put("deepika dhakal", 432);
            maps.put("shreeshant sharma", 2323);

            System.out.println(maps.get("chandan sharma"));

            System.out.println(maps);

            for(int i = 0;i<maps.size();i++){
                System.out.println((i));
            }

            System.out.println(maps.containsKey("shreeshant sharma"));


            String arr[] = {"chandan sharma","deepika dhakal","shreeshant sharma"};

            if(maps.containsKey(arr[0])){
                System.out.println(arr[1]+" is available in our tree map");
            }else{
                System.out.println("shreeshant was not found in our treee map");
            }

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("array indexing is the out of the bound");
        }

    }
}

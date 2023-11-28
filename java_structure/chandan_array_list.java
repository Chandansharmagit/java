import java.util.*;

import java.util.ArrayList;
import java.util.Collection;




public class chandan_array_list {
    public static void main(String args[]) {
        LinkedList<String> chandan = new LinkedList<String>();

        // chandan_array_list sharma = new chandan_array_list();

        chandan.add("the");
        chandan.add("name");
        chandan.add("is");
        chandan.add("chandan sharma");

        var names = chandan.get(2);
        System.out.println(names);

        chandan.add(2, "man");

        chandan.remove(2);

        System.out.println(chandan);

        //getting the size
        var size_man = chandan.size();
        System.out.println(size_man);

        //for loop
        for(int i = 0;i<chandan.size();i++){
            System.out.println(chandan.get(i));
        }

        Collections.min(chandan);


    }
}

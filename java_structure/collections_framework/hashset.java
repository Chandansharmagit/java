package collections_framework;
import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String args[]){
        Set<Integer>map = new HashSet<>();
        map.add(45);
        map.add(20);
        map.add(90);
        map.add(33);
        map.add(88);

        map.add(88);
        map.remove(88);

        System.out.println(map.contains(33));
        System.out.println(map.size());
        map.clear();

        System.out.println(map);

    }
    
}

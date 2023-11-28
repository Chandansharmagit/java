package collections_framework;

import java.util.Queue;
import java.util.LinkedList;

public class quew {
    public static void main(String args[]) {
        Queue<Integer > man = new LinkedList<>();
        // queewe offer used to add elements in the quewe
        man.offer(3);
        man.offer(4);
        man.offer(9);
        man.offer(19);

        System.out.println(man.poll());
        System.out.println(man);
        System.out.println(man.peek());
        
    }

}

package collections_framework;
import java.util.ArrayDeque;
public class decque {
    public static void main(String args[]){
        ArrayDeque<Integer>man = new ArrayDeque<>();
        man.offer(34);
        man.offer(78);
        man.offer(90);

        man.offerFirst(22);
        man.offerLast(10);

        System.out.println(man);


    }
}

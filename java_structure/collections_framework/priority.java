package collections_framework;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priority {
    public static void main(String args[]){
        Queue<Integer>man = new PriorityQueue<>(Comparator.reverseOrder());
        man.offer(34);
        man.offer(12);
        man.offer(55);
       

        System.out.println(man.peek());


    }
}

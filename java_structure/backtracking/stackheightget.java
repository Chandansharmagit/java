package backtracking;
import java.util.Stack;

public class stackheightget {
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

        //creating the satch height 
        static class Stack {
            public static Node head;

            public static boolean isEmpty(){
                return head == null;
            }

            //pushing the data 
            public static void push(int data){
                Node newnNode = new Node(data);
                if(isEmpty()){
                    head = newnNode;
                    return;
                }
                newnNode.next = head;
                head = newnNode;

            }
            //making the pop method
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int pop = head.data;
                head = head.next;
                return pop;
            }

            //making the peek method
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
    }

    

    public static void main(String args[]) {

        Stack newstack = new Stack();
        newstack.push(1);
        newstack.push(2);
        newstack.push(3);

        while(!newstack.isEmpty()){
            System.out.println(newstack.peek());
            newstack.pop();
        }
    }
}
package backtracking;


import java.util.Stack;

public class get {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        static class Stack {
            public static Node head;

            public static boolean isEmpty() {
                return head == null;
            }

            public static void push(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            //making the pop method to delete the data from the data
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int pop = head.data;
                head = head.next;
                return pop;
            }

            //using the peek method 
            public static int peek(){
                if(isEmpty()){
                    return -1;

                }
                return head.data;
            }
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}

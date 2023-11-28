package backtracking.linked_list_questions;

public class questions1 {
    Node head;
    private int size;

    questions1() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String date) {
            this.data = date;
            this.next = null;// the next null should most be null because we dont know the next value
            size++;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;// assigning the new node to the head because the next node of head is null
            return;
        } else {
            newNode.next = head;// it has pointing itself to the new node
            head = newNode;// and the new node became the head
        }
    }

    // for add last

    public void addlast(String data) {
        // creating a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;// assigning the new node to the head because the next node of head is null
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // for print list element in the node list

    public void printlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // deleting the first node of the node element

    public void deletefirst() {
        if (head == null) {
            System.out.print("this list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deleting the last element of the node list
    public void deletelast() {
        if (head == null) {
            System.out.println("this list is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlastNode = head;
        Node lasNode = head.next;
        while (lasNode.next != null) {

            lasNode = lasNode.next;
            secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]) {
        questions1 list = new questions1();
        list.addfirst("a");
        list.addfirst("is");

        list.addfirst("deepika dhakal");

        list.printlist();

        list.addlast("chandan sharma");
        list.printlist();

        list.deletefirst();
        list.printlist();

        list.deletelast();
        list.printlist();

        list.getSize();
      
      

        list.addfirst("man");
        list.printlist();

          System.out.println(list.getSize());
    }
}

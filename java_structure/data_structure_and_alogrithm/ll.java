package data_structure_and_alogrithm;

public class ll {
    Node head;
  //  private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first element in the node

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // adding the new element in the last node

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

    // making the print value fot the next node to the element
    public void printlist() {
        Node currnNode = head;
        if (currnNode != null) {
            System.out.print(currnNode.data + " -> ");
            currnNode = currnNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        ll list = new ll();
        list.addfirst("chandan");
        list.printlist();

        list.addlast("h");
        list.printlist();

    }
}

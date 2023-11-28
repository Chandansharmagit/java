package backtracking;

public class muliti {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    // adding the first element in the string of linklist

    public void addfirst(String data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // adding element in the last in the linklist

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;

        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newnode;

    }

    // printing the data in the linklist

    public void printlist() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]) {
        muliti newman = new muliti();

        newman.addfirst("hello");
        newman.addfirst("chandan sharma");

        newman.printlist();

    }
}
package backtracking;

public class singular {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
        }
    }

    // adding the first nide to the liked list

    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;

        head = newnode;
    }

    // adding in the last in the linked list of the arrau

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

        //while loop for the itratting over the linklist

       

    }



    //to print the dara in the linklist

    public void printlist(){
        if(head == null){
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


    //to delete the element in linklist

    public void deletefirt(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }else{
            head = head.next;
        }
       


    }

    //to delete last element of the linklist

    public void deletelast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        Node secondLast  = head;
        Node lasNode = head.next;

        if(head.next == null){
            head = null;
            return;
        }

        while(lasNode.next != null){
            lasNode = lasNode.next;
            secondLast = secondLast.next;

        }

        secondLast.next = null;
    }

    public static void main(String args[]) {
        // making the objects class of singluar

        singular newsSingular = new singular();

        newsSingular.addfirst("the");

        newsSingular.addfirst("name");
        newsSingular.addfirst("is");

        //adding in the last in linkelist

        newsSingular.addlast("dpworld");

        newsSingular.deletefirt();

        newsSingular.deletelast();


        newsSingular.printlist();

    }
}

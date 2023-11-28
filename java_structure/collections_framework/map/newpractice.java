package collections_framework.map;

public class newpractice {

    static class Quese {
        static int arr[];
        static int size;
        static int rear = -1;

        // passing the constructor for the Queses
        Quese(int n) {
            arr = new int[n];
            this.size = n;

        }

        // checkin the queses it is empty or not

        public static boolean isEmpty() {
            return rear == -1;
        }

        // to add the elemenet in the quess value

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("quueses is full");
                return;

            }
            rear++;
            arr[rear] = data;
        }


        //to remove the element from the ques 

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty ques");
                return -1;
            }

            int front = arr[0];
            for(int i = 0;i<rear;i++){
                arr[i] = arr[i + 1];
            }

            

        }

    }

    public static void main(String args[]) {
        Quese news = new Quese(5);

    }
}

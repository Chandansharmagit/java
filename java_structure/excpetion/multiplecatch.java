package excpetion;

public class multiplecatch {
    public static void main(String args[]) {
        try {

            int a = 20, b = 10, c;
            c = a / b;
            System.out.println(c);
            System.out.println("hello world");

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");

        }
        try {

            int arr[] = {2,5,6,7,8};
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("beyond the array limit");

        }
    }
}

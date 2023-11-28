package excpetion;

import backtracking.find;

public class trycatchblock {
    public static void main(String args[]) {
        try {

            System.out.println("hello world");
            int a = 20, b = 0, c;
            c = a / b;
            System.out.println(c);
            System.out.println("like area");

        } catch (ArithmeticException e) {

        } finally {
            // finally block doesnot have any tyoes of parantheeses
        }

        System.out.println("main method has been ended");
    }
}

package excpetion;

import java.beans.Expression;

public class tryandthrow {

    public static void Wait() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);

            } catch (Exception r) {
                System.out.println(r);
            }

        }
    }

    public static void Mains() throws InterruptedException {

        for (int i = 0; i <= 10; i++) {
            System.out.println("i love you 3000");
            Thread.sleep(1000);
        }
    }

    public static void sharma()  {

        for (int i = 0; i <= 6; i++) {
            try {

                System.out.println("i love deepika 300" + i);
                Thread.sleep(1000);

            } catch (Exception h) {
                System.out.println(h);
            }
        }

    }

    public static void main(String args[]) {

        try {
            Wait();

            Mains();

            sharma();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("method has been ended sucessfully...");

    }
}

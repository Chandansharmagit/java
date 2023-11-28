package excpetion;

public class throwss {

    void div(int a,int b) throws ArithmeticException{
        if(b == 0){
           throw new ArithmeticException();
        }else{
            int c = a/b;
            System.out.println(c);
        }
    }
    public static void main(String args[])throws ArithmeticException {

        // for (int i = 0; i <= 10; i++) {
        //     try {
        //         System.out.println(i);
        //         Thread.sleep(1000);
        //     } catch (InterruptedException a) {
        //         System.out.println(a);
        //     }
        // }


        //getting the throw and throws difference problem 

        throwss newThrowss = new throwss();
        newThrowss.div(20, 0);
       



    }
}

package recursion;

public class printsum {
    public static void printSum(int i, int n, int sum) {


        //writing the base code for the sum of element


        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        //writing the main work of the code

        sum += i;
        printSum(i + 1, n, sum);
       // System.out.println(i);
        

    }

    public static void main(String args[]) {
      printSum(1, 10, 0);
    }

}

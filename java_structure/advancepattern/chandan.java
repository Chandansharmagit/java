package advancepattern;

import java.util.Scanner;


public class chandan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            //inner looop
            for(int j = 1;j<= n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}


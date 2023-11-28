package towDarray;

import java.util.Scanner;

public class findarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //decalaring the 2d variables

        int [][]chandan = new int[rows][cols];

        //for looop
        //outer loop
        for(int i = 0;i<rows;i++){
            //inner loop
            for(int j = 0;j<cols;j++){
                chandan[i][j] = sc.nextInt();
            }
        }


         int x = sc.nextInt();
         for(int i = 0;i<rows; i++){
            for(int j = 0;j<cols;j++){
                if(chandan[i][j] == x ){
                    System.out.print("x is found at this place : ( "+ i +" , " + j + ")" );
                }
            }

         }



         //for output loop
        
         

        sc.close();
    }
}

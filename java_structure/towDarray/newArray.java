package towDarray;
import java.util.Scanner;

public class newArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //declearing the array
        int [][]chandan = new int[rows][cols];

        //for int loop
        //outer loop
        for(int i = 0;i<rows;i++){
            //inner loop
            for(int j = 0;j<cols;j++){
                chandan[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        //for output
        int x = sc.nextInt();

        for(int i = 0;i<rows;i++){
            //inner loop
            for(int j = 0;j<cols;j++){
                if(chandan[i][j] == x){
                    System.out.println("x is the found at this place  : ( " + i + " , " +j + ")");
                }
            }
        }
        sc.close();
    }
}

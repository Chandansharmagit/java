package string;

import java.util.Scanner;



public class strings {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int cols = sc.nextInt();

    // declaring 2d arrays

    int[][] chandan_2d = new int[row][cols];

    // for loop
    // outer loop
    for (int i = 0; i < row; i++) {
      // inner loop
      for (int j = 0; j < cols; j++) {
        chandan_2d[i][j] = sc.nextInt();
      }
    }
    // lets find the place of x

    int x = sc.nextInt();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        if (chandan_2d[i][j] == x) {
          System.out.println("x is founda at this place ,  ("+ i + " ," +j+ ")" );
        }
      }
    }

    sc.close();

  }
}

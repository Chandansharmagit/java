

import java.io.File;
// import java.io.Exception;

import java.util.*;

public class filewriting {
    public static void main(String args[]) {
        // entering the file name that we want to access
        try {
            File myObj = new File("deepikadharma.java");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (Exception e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}

import java.io.File; // Import the File class
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class matcher {

  public static void main(String args[]) {
    // creating the file in
    // try {
    // // making the new file
    // File myFile = new File("deepikachanan.java");
    // if (myFile.createNewFile()) {
    // System.out.println("file has created " + myFile.getName());
    // } else {
    // System.out.println("the file already exists");
    // }

    // } catch (IOException e) {
    // System.out.println("an error occures");
    // e.printStackTrace();
    // }

    // writting into the file with java

    try {
      FileWriter writer = new FileWriter("deepikachanan.java");
      writer.write("hello chandan sharma how are you i hope you are fine there");

      writer.close();
      System.out.println("file succesfully written");

    } catch (IOException e) {
      System.out.println("an error occured");
      e.printStackTrace();
    }

    // accessing the file with java

    try {
      FileReader reader = new FileReader("filewriting.java");
      Scanner scanner = new Scanner(reader);

      while (scanner.hasNextLine()) {
        String data = scanner.nextLine();
        System.out.println(data);
      }
      scanner.close();

    } catch (IOException e) {
      System.out.println("an error occured");
      e.printStackTrace();
    }

    // deleting the file with file handeling with java

    File mFile = new File("deepikachanan.java");
    if (mFile.delete()) {
      System.out.println("the file has suceesfully deleted " + mFile.getName());
    } else {
      System.out.println("the file not found");
    }

    // making the new file in the new socket
    try {
      // making the new file name with dpworld,data
      File newfile = new File("newname.java");
      if (newfile.createNewFile()) {
        System.out.println("the new file has been created " + newfile.getName());
      } else {
        System.out.println("file already exists");
      }

    } catch (IOException e) {
      System.out.println("an error occured");
      e.printStackTrace();
    }

  }
}

package filehandeling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.*;

import recursion.sorting;

public class creating {
    public static void main(String args[]) {
        // try{
        // FileReader reader = new FileReader("recursion/fibonacii.java");
        // Scanner sharma = new Scanner(reader);

        // while(sharma.hasNextLine()){
        // String data = sharma.nextLine();
        // System.out.println(data);
        // }

        // sharma.close();

        // }catch(Exception e){
        // System.out.println("an error occureed");
        // e.printStackTrace();
        // }
        // creating the file and method and handeling the data

        // try {
        // File newfFile = new File("dsa.java");
        // if (newfFile.createNewFile()) {
        // System.out.println("the new file has been created sucessful");
        // } else {
        // System.out.println("a file already exists");
        // }

        // } catch (Exception a) {
        // System.out.println("an error ocured in the making the new file");
        // }

        // wrtiting into the file

        // try {

        // FileWriter newWriter = new FileWriter("d.java");
        // newWriter.write("hello i am chandan sharma");
        // newWriter.close();

        // System.out.println("file writing sucesful");

        // } catch (Exception b) {
        // System.out.println("an error occured while writing the file");
        // b.printStackTrace();
        // }

        // lets a create new file

        try {
            File newfFile = new File("d.java");

            if (newfFile.createNewFile()) {
                System.out.println("a new file has been created sucesss");
            } else {
                System.out.println("failed to create or file already exits");
            }

        } catch (Exception a) {
            System.out.println("an eroro occures");
            a.printStackTrace();
        }

        // deleting the file

      

          

    }
}

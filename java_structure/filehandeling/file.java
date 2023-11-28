package filehandeling;

import java.beans.Expression;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//bnmn/ import java.util.*;

public class file {

    public static void main(String args[]) {
        //to create the files 
        try{
              File muFile = new File("mens.java");
              if(muFile.createNewFile()){
                System.out.println(" a new file created " + muFile.getName());
              }else{
                System.out.println("a file already exits");
              }

        }catch(Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }

        //writing the data in the created files

        try{
            FileWriter writer = new FileWriter("mens.java");
            writer.write("hello deepika dhakal");

            writer.close();

            System.out.println("successfully wrote to the mens.java file");

        }catch(Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }


        //reading the file 

        // try{
        //     FileReader reader = new FileReader("mens.java");
        //     Scanner myreader = new Scanner(reader);

        //     while (myreader.hasNextLine()) {
        //         String data = myreader.nextLine();
        //         System.out.println(data);
        //     }
        //     myreader.close();
        // }catch(Exception e){
        //     System.out.println("an error occured");
        //     e.printStackTrace();
        // }


        //to delete the files 

        try{
            File man = new File("deepikashrma.java");

            if(man.delete()){
                System.out.println("the file has been deleted succesfully " + man.getName());
            }else{
                System.out.println("failed to delete the files because it doesnot exits");
            }
        }catch(Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
      
      

    }
}

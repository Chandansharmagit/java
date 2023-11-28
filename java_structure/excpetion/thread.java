package excpetion;

import recursion.sorting;

public class thread {
    public static void main(String args[]) {

        try {

            String mains = null;
            System.out.println(mains.toUpperCase());

        } catch (NullPointerException e) {

            System.out.println("null cannnot be change into lower case and upper case in java");

        }


        //conveting string to number

        String str = "chandan";
        try{
            int a = Integer.parseInt(str);
            System.out.println(a);

        }catch(ArithmeticException n){
            System.out.println("string " + str +"annot be changed into the integar");
        }
        System.out.println("program ended");

    }
}

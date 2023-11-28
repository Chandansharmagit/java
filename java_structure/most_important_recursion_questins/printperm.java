

package most_important_recursion_questins;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.xml.sax.SAXException;

public class printperm {
    // public static void printp(String str,String perm){

    // //base work

    // if(str.length() == 0){
    // System.out.println(perm);
    // return;
    // }
    // //main work
    // for(int i = 0;i<str.length();i++){
    // char currChar = str.charAt(i);
    // String newStr = str.substring(0, i) + str.substring(i + 1);
    // printp(newStr, perm+currChar);

    // }

    // }
    // public static void main(String args[]){
    // String str = "abc";
    // printp(str, "");
    // }

    // count total paths in a maze to move from

    // public static void main(String args[]) {
    // int n = 3,m =3;
    // int totalPath = countPaths(0, 0, n, m);
    // System.out.println(totalPath);
    // }

    // place the tiles in the floor

    // public static int placetiles(int n, int m) {
    // base code

    // if(n == m){
    // return 2;
    // }
    // if(n < m){
    // return 1;
    // }

    // main work
    // for vertical placement
    // int verticalplacement = placetiles(n-m, m);

    // for horizonatal placement
    // int horizonatalPlacement = placetiles(n, m-n);
    // return verticalplacement + horizonatalPlacement;

    // }

    // public static void main(String args[]) {
    // int n = 3 , m = 5;
    // System.out.println(placetiles(n, m));
    // }

    // find the number of ways in which you can invite n people of your party single
    // or in pairs

    // public static int party(int n) {
    // base work

    // if(n <= 1){
    // return 1;
    // }
    // main work

    // int guest1 = party(n - 1);

    // for more guest
    // int guest2 = (n -1) * party(n - 2);
    // return guest1 + guest2;

    // }

    // public static void main(String args[]) {

    // int n =4;
    // System.out.println(party(n));
    // }

    // the most important questions
    // print all the subject to set of their first and natural numbers

    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findsubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {

        }

        // add hoga
        subset.add(n);
        findsubset(n - 1, subset);

        // add nahi hoga
        subset.remove(subset.size() - 1);
        findsubset(n - 1, subset);
    }

    public static void main(String args[]) {
        int n = 3;
    
        findsubset(n, null);
    }

}

package recursion;

public class toweofHanoi {
    public static void hanoi(int n, String src, String helper, String dest) {

    if (n == 1) {
    System.out.println("transfer disk from " + n + " from " + src + "to " +
    dest);
    return;
    }

    hanoi(n - 1, src, dest, helper);
    System.out.println("transfer disk from " + n + "from " + src + " to" + dest);
    hanoi(n-1, helper, src, dest);
    return;
    }

    public static void main(String args[]) {
    int n = 2;

    hanoi(n, " S ", "H", "D");

    }

    // public static void reverse(String str, int idx) {
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //        return;
    //     }

    //    System.out.print(str.charAt(idx));
    //     reverse(str, idx-1);
       

    // }

    // public static void main(String args[]) {
    //     String str = "chandan sharma";
    //     reverse(str, str.length()-1);

       
    // }




    //find the 1st and last occurence and an element in string
    }
package recursion;

public class sorting {
    // public static boolean isSorted(int arr[], int idx) {

    // if(idx == arr.length -1){
    // return true;
    // }
    // if(arr[idx] > arr[idx + 1]){
    // return isSorted(arr, idx+1);//array sorted
    // }else{
    // return false;
    // }
    // }

    // public static void main(String args[]){
    // int arr[] = {1,4,5,6};
    // System.out.println(isSorted(arr, 0));
    // }

    public static boolean[] map = new boolean[26];// english alphabet

    // public static void removedublicates(String str, int idx, String newString) {

        // base case
        // if (idx == str.length()) {
        //     System.out.println(newString);
        //     return;
        // }
        // main work
        // char currchar = str.charAt(idx);
        // if (map[currchar - 'a'] == true) {
        //     removedublicates(str, idx + 1, newString);
        // } else {
        //     newString += currchar;
        //     map[currchar - 'a'] = true;
        //     removedublicates(str, idx + 1, newString);

        // }

    // }

    // public static void main(String args[]) {
    //     // main function
    //     String str = "abxgxxxbh";           
    //     removedublicates(str, 0, "");

    // }




    //find the subsequences of the given string

    public static void subsequences(String str,int idx,String newString){
        //base case

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        //main work
        //part to be
        char currChar = str.charAt(idx);
        subsequences(str, idx+1, newString+currChar);
        

        //part not to be
        subsequences(str, idx+1, newString);
        
        
    }
    public static void main(String args[]){
       String str = "abc";
       subsequences(str, 0, "");

        //main function

    }


}

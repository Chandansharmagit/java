package backtracking;

public class quenns {
    public static void printPermutation(String str,String perm,int idx){

        //base code
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        //main work

        for(int i = 0;i<str.length(); i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newstr, perm + currChar, idx + 1);
        }
        
    }
    public static void main(String args[]){
        //main function
        String str = "ABC";
        printPermutation(str, "", 0);
       
    }
}

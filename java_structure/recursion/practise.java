package recursion;

public class practise {
    public static void findTowerofhanoi(int n, String src,String helper,String destiny){


        if( n == 1){
            System.out.println("the disk transfer from place " + n  + " to " + src + " to " + destiny);
            return;
        }


        findTowerofhanoi(n-1, src, helper, destiny);
        System.out.println("the disk transfer from " + n + " to " + src + " to " + destiny);
        findTowerofhanoi(n-1,helper , src, destiny);
    }
    public static void main(String args[]){
        int n = 3;

        findTowerofhanoi(n, "S", "H" ,"D");
    }
    
  
}

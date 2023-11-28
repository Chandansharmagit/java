package recursion;

public class factorial {
    public static int factorialNum(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        int cal1 = factorialNum(n-1);
        int call2 = n*cal1;
        return call2;
    }
    public static void main(String args[]){
        int n = 3;
        int ans = factorialNum(n);
        System.out.println(ans);


    }
}

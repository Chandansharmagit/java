package recursion;

public class stachheight {
    public static int calpower(int x,int n){
        if( n == 0){      //base case 1
           return 1;
        }
        if(x == 0){    //base case 2
            return 0;
        }

        //if n is givenh
        if(n % 2== 0 ){
            return calpower(x, n/2) * calpower(x, n/2);
         }else{//if n is add
             return calpower(x, n/2) * calpower(x, n/2) * x;
        }
    
    }
    public static void main(String args[]){
        int x = 3, n = 5;
        int ans = calpower(x, n);

        System.out.println(ans);
    }
}

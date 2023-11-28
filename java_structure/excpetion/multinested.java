package excpetion;

public class multinested {

    public static void main(String args[]) {
          try{
             System.out.println(10/0);
            try{
                int a[] = {10,40,50};
                System.out.println(a[2]);
            }catch(ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
           
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("learn coding");
    }
}

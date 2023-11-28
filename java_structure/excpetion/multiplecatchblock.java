package excpetion;

public class multiplecatchblock {
    public static void main(String args[]) {
        try {
            int a = 10, b = 10, c;
            c = a / b;
            System.out.println(c);
            System.out.println("divide sucess");

            int arr[] = {4,5,6,2,8,90};
            System.out.println(arr[0]);


            String name = "chadnan sharma";
            System.out.println(name.toUpperCase());

        // } catch (ArithmeticException e) {
        //     System.out.println("cannot divide the number by zero");

        // } catch (ArrayIndexOutOfBoundsException b) {
        //     System.out.println("array index out of bound");

        }catch(Exception c){
            System.out.println("methid has been ended");
        }
        System.out.println("method has been sucessfully ended with the data and the flow with name of chandan sharma");
        
    }
}

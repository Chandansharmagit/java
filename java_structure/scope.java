public class scope {
    public static void main(String args[]) {

        // this is the method scope
        int x = 15;
        System.out.println(x);

        // this is the block scope

        {

            int n = 45;
            System.out.println(n);
        }

    }
}

package excpetion;

public class trycatchandthrowandthroes {
    public static void Vote() throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("not eligible for votting");
        } else {
            System.out.println("eligible for voting");
        }
    }

    public static void main(String args[]) {
        
    }

}

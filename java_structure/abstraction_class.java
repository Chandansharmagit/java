import string.animal;
import string.pig;

abstract class animal {
    // abstract doesnot have any body
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzzz");
    }

}

// inherit form his parent abstrat class
class pig extends animal {
    public void animalSound(){
        //the body of the animal sound is provided here
        System.out.println("the sound of the animal pig is : weee weee");

    }
}

public class abstraction_class {
    public static void main(String args[]) {
        pig mPig = new pig();
        mPig.animalSound();
        mPig.sleep();

    }

}

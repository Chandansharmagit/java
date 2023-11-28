package object_oriented_prgramming;

abstract class Main {
    // abstract class doesnot have an body
    public abstract void animalsound();

 
}

class Deepika extends Main {
    public void animalsound() {
        System.out.println("the animals making the sound wee weee");
    }
}

public class abstraction {

    public static void main(String args[]) {
        // making the objects for the deepika
        Deepika newdeepika = new Deepika();
  newdeepika.animalsound();

    }
}

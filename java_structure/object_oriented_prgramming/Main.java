package object_oriented_prgramming;

public class Main {
    public static void main(String args[]) {
        // person newpwPerson = new person();
        // newpwPerson.age = 10;
        // newpwPerson.name = "chandan sharma";
        // System.out.println(newpwPerson.name);
        // System.out.println(newpwPerson.age);
        // newpwPerson.walk();
        // newpwPerson.running();

        // passing the constructor value

        // for another class for door

        // door nwDoor = new door();
        // nwDoor.agess = 20;
        // nwDoor.names = "chandan sharma";
        // System.out.println(nwDoor.names);

        // acccessing the inheritance

        // pig newpig = new pig();
        // // newpig.pigs();
        // dogs newDogs = new dogs();
        // newDogs.pigs();
        // newDogs.walk();

    
  
       
        // encapculations.dowork();

    


    }
}

// creating the class with anyname

class person {
    String name;
    int age = 10;

    // public void walk(){
    // System.out.println(name +" is walking");
    // }
    // public void running(){
    // System.out.println(name + " is running");
    // }
    // making the constructor

}

// making the another class for the constructor
class door {
    int agess;
    String names;

    public void mail(int ages, String newname) {
        agess = ages;
        names = newname;
    }
}

// inheritance
class pig {
    public void pigs() {
        System.out.println("the pigs makes sound wee weee");
        System.out.println("and the cow makes the sound cow cow ");
    }

    public void walk() {
        System.out.println("chandan sharma is walking on street of california with his team memeberss");
    }

    // making the ineritancew

}

class dogs extends pig {
    public void car() {
        System.out.println("my best car is lamborghini and audi r8");
    }

    public void walks() {
        System.out.println("chandan sharma is walking on street of california with his team memebers");
    }
}
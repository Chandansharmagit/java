package oops;


import oops.outerclass.innerclass;

class Main {
    private String name;
    private String lastname;

    // getting the value of name and lastname by get methods

    public String getName() {
        return name + lastname;
    }

    public void setName(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}

class chandanclas {
    String brand = "lamborghini";
    String carName = "ferrari";

    public void sharma() {
        System.out.println("the name is chandan sharma");
    }
}

// inheriy the class of chandanclas

class car extends chandanclas {
    String modelName = "lamborghini";
    String modelPricing = "4million";

    public void pricing() {
        System.out.println("the best car is lamborghini and ferrari for their speed and sporty");
    }
}

// java inner classes
class outerclass {
    int x = 6;

    class innerclass {
        int y = 7;
    }
}

public class inheritance {
    public static void main(String args[]) {
        // creating the objects to acces the variable value of private class
        // Main newman = new Main();
        // newman.setName("chandan ", "sharma");
        // System.out.println(newman.getName());

        // car newc = new car();
        // newc.chandanclas;
        // System.out.println(newc.brand);

        // creating the objects for outer class
        outerclass newuniverse = new outerclass();
        // creating objects fot the inner clas
        outerclass.innerclass motor = newuniverse.new innerclass();
        System.out.println(newuniverse.x + motor.y);

        

       
       
    }
}

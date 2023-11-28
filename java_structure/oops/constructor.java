package oops;

import recursion.chandan;

//class of name car and its type
class Car {
    int price;
    String model;
    String name;

    // lets create constructow and passing the parameter
    public Car(int prices, String models, String names) {
        price = prices;
        model = models;
        name = names;

    }
}

public class constructor {
    public static void main(String arga[]) {
        //making the object of ocns constructoe and passing the paramete
        Car newCar = new Car(4300304, "lamborghini", "lamborghini aventador");

       System.out.println(newCar.name);
    }
}

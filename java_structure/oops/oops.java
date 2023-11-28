package oops;

import string.strings;

class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class student {
    String name;
    int age;

    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // student(student s2){
    //    this.name = s2.name;
    //    this.age = s2.age;
    // }
    // student(){

    // }

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " +age);
    }
}

public class oops {
    public static void main(String args[]) {
        // pen pen1 = new pen();
        // pen1.color = "red";
        // pen1.type = "gel";

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen1.type = "gel";

        // pen1.write();
        // pen2.printColor();

        student s1 = new student();
        s1.name = "chandan sharma";
        s1.age = 19;


        // student s2 = new student(s1);

        s1.printInfo(s1.name);
    }

}

package oops;

import towDarray.newArray;

class names {
    private String names;

    // using the setname in the private
    public String getName() {
        return names;
    }

    // using the setname value fot the setting the value in the
    public void setName(String name) {
        this.names = name;
    }
}

public class publicclass {
    public static void main(String args[]) {
        //creating the objects 
        names newman = new names();
        newman.setName("man in the world");

        System.out.println(newman.getName());
    }
}
package object_oriented_prgramming.enccap;

public class encapsulations {
    public static void main(String args[]) {

        car newcar = new car();
        newcar.setPrice(452);
        System.out.println(newcar.getPrice());

    }
}

class car {

    String names;
    private int price;

    public String getNames() {
        return names;
    }

    // public void setNames(String names) {
    //     this.names = names;
    // }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("you cannot set the value");
        } else {
            this.price = price;
        }

    }

}

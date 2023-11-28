package oops;

import advancepattern.chandan;

class laptop{
    String color;
    String price;
    String type;
    public void chandan_laptop(String color,String price,String type){
        System.out.println("the "+color+ " of laptop "+"and the price of laptop is"+price+"and type is"+type );
    }
    public void chandan_laptop(String name,String piller){
        System.out.println(name +" "+piller);
    }
    public void chandan_laptop(String khann,int chandan_sharma){
        System.out.println(khann+" "+chandan_sharma);
    }
}
public class interfaces{
    public static void main(String args[]){
        laptop laptop1 = new laptop();
        laptop1.color = "dark blue";
        System.out.println(laptop1.color);

        laptop1.chandan_laptop("dark blue", "135000", "hp pavilion 15");
        //calling another function
        laptop1.chandan_laptop("chandan", "deepika sharma");
    }
}




public class Statics {
    // making the static method
    // static void main(){
    // System.out.println("chandand sharma");
    // }
    // //making the public method
    // public void mains(){
    // System.out.println("hello world");
    // }

    // making the constructor fot the java

    int x;

    public Statics() {
        int x = 45;
    }

    public static void main(String args[]) {
        // calling the static metod
        // statics.main();

        // //making the objects for the access for the public
        // statics news = new statics();
        // news.mains();

        // now giving the constructor value to the x
        Statics news = new Statics();
        System.out.println(news.x);

    }
}

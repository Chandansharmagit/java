package collections_framework;
import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<String> memes = new Stack<>();
        //to add the elements in the stack you most use push method
        memes.push("chadnan");
        memes.push("making");
        memes.push("natural");

        // for (String g : memes) {
        //     System.out.println(g);
            
        // }

        // System.out.println(memes.peek());
        // System.out.println(memes);
        memes.pop();
        System.out.println(memes.peek());
    }
}

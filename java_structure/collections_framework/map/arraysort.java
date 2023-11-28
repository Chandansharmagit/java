package collections_framework.map;

import java.util.Arrays;

public class arraysort {
    public static void main(String args[]) {
        // making the primitive array type in the arrayclass

        int arr[] = { 4, 3, 6, 8, 2, 90, 45 };
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(arr.equals(2));

       arr.hashCode();
    }
}

import practise.reverse;
import sorting.mergesort;

public class node {
    public static void conqueror(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // checking the condition
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // for remaining part for idx 1
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // for remaining part for idx2
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // putting the value of array into the merged
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {
        // base code too be excute
        if (si >= ei) {
            return;
        }
        // main work of rhe function
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        // for conqueror part
        conqueror(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 5, 8, 9, 2 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

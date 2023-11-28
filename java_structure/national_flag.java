
public class national_flag {

    public static void merge(int []arr, int si, int mid, int ei) {
        // let create the array of merged
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // checking the condition of merged short
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }

        }

        // for remaining part in conqeror
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // checking the remainng part in index2
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // checking for looop over the index of array
        for (int i = 0, j = si; i <= merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void findMergesort(int arr[], int si, int ei) {
        // base code of recursion
        if (si >= ei) {
            return;
        }
        // main work of the code of recursion

        int mid = si + (ei - si) / 2;
        findMergesort(arr, si, mid);
        findMergesort(arr, mid + 1, ei);
        // main function of the recursion
        merge(arr, si, mid, ei);

    }

    // merge sort
    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        findMergesort(arr, 0, n - 1);
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}

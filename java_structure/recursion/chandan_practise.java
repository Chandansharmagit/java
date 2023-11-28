package recursion;

public class chandan_practise {
    public static void conqeror(int arr[],int si,int mid,int ei){
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        //checking the condition og the code to ne excute in the array
        while(idx1 <= mid && idx1 <= ei){
           if(arr[idx1] <= arr[idx2]){
            merged[x++] = arr[idx1++];
           }else{
            merged[x++] = arr[idx1++];
           }
        }
        //for remaining empty part
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        //for remaining part in idx2 part of array
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }


        //applying for loop to iterate the data
        for(int i = 0,j = si;i<=merged.length;i++,j++){
            arr[j] = merged[i];
        }




    }

    public static void find_backtracking(int arr[],int si,int ei){
        //base case

        if(si >= ei){
            return;
        }
        //main work of the code that to be excute in the array
        int mid = si + (ei - si)/2;
        find_backtracking(arr, si, mid);
        find_backtracking(arr, mid + 1, ei);

        //for the conqeror part
        conqeror(arr, si, mid, ei);
        
    }
    public static void main(String args[]){
        int []arr = {6,3,4,8,9,2};
        int n = arr.length;
        find_backtracking(arr, 0, n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

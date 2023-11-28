package recursion;

public class pivotandpartition {


    //writinmg the partition functin
    public static int partition(int arr[],int low,int high){
        int pidx = arr[high];
        int i = low -1;

        for(int j = low;j<high - 1;j++){
           if(arr[j] < pidx){
            i++;
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           }
        }

        i++;
        int temp = arr[i];
        arr[i] = pidx;
        arr[high] = temp;
        return i;
    }
    public static void calculate_pivot(int arr[],int low,int high){

        //base code of the function
        

        //main code of this function
        if(low < high){
            int pid_idx = partition(arr, low ,high);

            //calling the pivot lesser than selected pivot of last element
            calculate_pivot(arr, low, pid_idx - 1);
            //calling the pivot greater than pivot of last element
            calculate_pivot(arr, pid_idx + 1, high);
        }
        
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        calculate_pivot(arr, 0, n - 1);

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}

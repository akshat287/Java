public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temo =arr[i];
        arr[i]=arr[high];
        arr[high]=temo;
        return i;
    }
   

    public static void quicksort(int arr[],int low, int high){
        if(low<high){
            int pindx=partition(arr,low,high);
            quicksort(arr, low, pindx-1);
            quicksort(arr, pindx+1, high);
        }
        else return;

    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quicksort(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

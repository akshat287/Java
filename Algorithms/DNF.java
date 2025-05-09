public class DNF{
    public static void main(String[] args) {
        int []arr={2,0,1,2,0,1,0,2,0,1,0,2,1,1};
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;mid++;
            }
            else if(arr[mid]==1)mid++;
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
    }
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
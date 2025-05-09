public class Insert {
    public static void main(String args[]){
        int a[]={2,6,3,7,3,4,8,6,1,4};
        print(a);
        work(a);
        print(a);
    }
    private static void work(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }
}

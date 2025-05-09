public class Selection {
    public static void main(String[] args) {
        int arr[]={78,2,45,4,8,12,34,78,11,24};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }System.out.println();
            }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // ......Space Complexity--> O(1) ...//
        // ......Time Complexity--> O(n*n)...//
        // ......Best case--> O(n)...//
        // ......Worst Case--> O(n*n)...//
    }
}

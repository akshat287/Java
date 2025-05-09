
public class Bubble {
    public static void main(String[] args) {
        int arr[]={45,8,9,34,56,21,19,3};
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                for(int k=0;k<arr.length;k++){
                    System.out.print(arr[k]+" ");
                }System.out.println();
            }
            System.out.println();
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        //......Space Complexity--> O(1) ...//
        // ......Time Complexity--> O(n*n)...//
        // ......Best case--> O(n*n)...//
        // ......Worst Case--> O(n*n)...//

    }
    
}


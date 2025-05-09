import java.util.*;
public class Sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={111,12,33,6,227,54,23};
        msort(arr, 0, arr.length-1);
        print(arr);
        
    }

    //..Print Array/../
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    //..BUbble sort..// 
    public static void bub(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
    }

    //..Selection sort...//
    public static void sel(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j])small=j;
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
            // for(int k=0;k<arr.length;k++){
            //     System.out.print(arr[k]+" ");
            // }System.out.println();
        }
    }

    // Insertion sort //
    public static void ins(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int j=i+1;
            while(j>=0 && arr[j]>num){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=num;
        }
    }

    //..Merge Sort..//

    public static void msort(int []arr, int s,int e){
        if(s>=e)return;
        int mid=s+(e-s)/2;
        msort(arr,s,mid);
        msort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    public static void merge(int arr[],int s,int mid, int e){
        int i=s,j=mid+1,k=0;
        int ans[]=new int[e-s+1];
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }
            else ans[k++]=arr[j++];
        }
        while(i<=mid){
            ans[k++]=arr[i++];
        }
        while(j<=e){
            ans[k++]=arr[j++];
        }
        for(int n=0;n<arr.length;n++){
            arr[n]=ans[n];
        }
    }


}

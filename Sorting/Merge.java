import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr[]={2,56,78,3,4,2,45,32,56,4,22,3,1};
        int mix[]=mergesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(mix[i]+" ");
        }
        

    }

    static int[] mergesort(int []arr){
        if(arr.length==1){
            return arr;  
        }
        int mid=arr.length/2;
        int []right=mergesort(Arrays.copyOfRange(arr,0,mid));
        int []left=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }

    ///....Merging the TWO Arrays...///
    private static int[] merge(int[] a,int[] b){
        int ans[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j])ans[k++]=b[j++];
            else ans[k++]=a[i++];
        }
        while(i<a.length){
            ans[k++]=a[i++];
        }
        while(j<b.length){
            ans[k++]=b[j++];
        }
        return ans;
    }
}

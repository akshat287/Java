public class Boyer_Moore {
    public static void main(String []args){
        int arr[]={3,3,5,3,4};
        int ans=arr[0],cnt=0;
        for(int i:arr){
            if(i==ans)cnt++;
            else cnt--;

            if(cnt==0){
                ans=i;
                cnt=1;
            }
        }
        System.out.println(ans);
    }
}

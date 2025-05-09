public class Recurrsion {
    public static void suum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        suum(i+1,n,sum);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibbo(int n){
       if(n==0){
        return 0;
       }
       else if(n==1){
        return 1;
       }
       else return fibbo(n-1)+fibbo(n-2);

    }


    public static void main(String args[]){
        suum(1,5,0);
        System.out.println(factorial(5));
        int n=8;
        for(int i=0;i<n;i++){
        System.out.print(fibbo(i)+" ");}

    }
}

import java.util.Scanner;

public class BInary {

     public int ToBinary(int num){
        int n=-1,res=0,i=0;
        while(num!=0){
            n=num%2;
            res=(int)Math.pow(10,i)*n+res;
           // res=res*10+bit;
            num=num/2;
            i++;
        }return res;
    }

    public int ToDecimal(int num){
        int n,res=0,i=0;
        while(num!=0){
            n=num%10;
            res=(int)Math.pow(2,i)*n+res;
            num=num/10;
            i++;
        }return res;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        BInary b=new BInary();
        int num2=b.ToBinary(num1);
        System.out.println(num2);
        System.out.println(b.ToDecimal(num2));
    }
}

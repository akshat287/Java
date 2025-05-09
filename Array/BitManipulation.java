import java.util.*;
public class BitManipulation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pos=sc.nextInt();
        int mask=1<<(pos-1);

        ///..Get Bit..///
        if((mask&num)==0){
            System.out.println("Bit: 0");
        }
        else System.out.println("Bit: 1");

        ///..Set Bit../// -->1
        int newNum=(mask|num);
        System.out.println(newNum);

        //..Clear Bit../// -->0
        int n=(num&~mask);
        System.out.println(n);

        //..Update Bit..// 1-->0 and 0-->1
        int op=sc.nextInt();
        if(op==1){
            int neNum=(mask|num);
            System.out.println(neNum);
        }
        else {
            int nuu=(num&~mask);
            System.out.println(nuu);
        }

    }
    
}

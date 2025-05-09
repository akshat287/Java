import java.util.*;
public class Condition {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num = sc.nextInt();

    //     if(num%2==0){
    //         System.out.println("Even");
    //     }
    //     else System.out.println("Odd");

        //..Switch.....

    Scanner sc=new Scanner(System.in);
    int button = sc.nextInt();

    switch(button){
        case 1: System.out.println("Namaste");
         break;
        case 2: System.out.println("Hello");
        break;
        case 3: System.out.println("Bonjure");
        break;
        default: System.out.println("Invalid input");
    }

    }
}

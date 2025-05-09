import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("ore-wo nava "+name);

        //Concatenation..,
        String firstname="Eren";
        String lastname="Jeager";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);

        //Length...
        System.out.println(fullname.length());

        //CharAt...
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        //Compare..
        String name1="hello";
        String name2="Jeager";
        int num=name1.compareTo(name2);
        if(num>0){
            System.out.println(name1+" > "+name2);
        }
        else if(num<0){
            System.out.println(name1+" < "+name2);
        }
        else System.out.println("same-same");

        //Sub-string...
        String sent="Life is too short, just give up on your dreams and die.";
        String nn=sent.substring(24,32);
        String okay=sent.substring(19);
        System.out.println(nn);
        System.out.println(okay);

       //Replace...
       String strr=sc.nextLine();
       String neww="";

       for(int i=0;i<strr.length();i++){
            if(strr.charAt(i)=='a'){
                neww+='b';
            }
            else neww+=strr.charAt(i);
        }
        System.out.println(neww);

        //Delete...
        String email=sc.next();
        String username="";
        int i=0;
        while(email.charAt(i)!='@'){
            username+=email.charAt(i);
            i++;
        }System.out.println(username);



    }
}
  
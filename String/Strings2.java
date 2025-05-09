public class Strings2 {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Eren Jeager");
        System.out.println(sb);

        //set char at index..
        sb.setCharAt(5,'Y');
        System.out.println(sb);

        //Insertion..,/////
        sb.insert(4,'n');
        System.out.println(sb);

        //Deletion..//////////
        sb.delete(6,sb.length());
        System.out.println(sb);

        //Append..///////////
        StringBuilder s=new StringBuilder("a");
        s.append("d");
        s.append("i");
        s.append("t");
        s.append("i");
       
        System.out.println(s.length());

        //Reverse../////////////
        for(int i=0;i<s.length()/2;i++){
            int front=i;
            int back=s.length()-1-i;

            char frontt=s.charAt(front);
            char backk=s.charAt(back);
            
            s.setCharAt(front, backk);
            s.setCharAt(back,frontt);
        }
        System.out.print(s);
        System.out.println();
     ///////////////////////////////////
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }System.out.println();

        
    }
}

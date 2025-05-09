import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        //..add element in list..//
        a2.add(1);
        a2.add(8);
        a2.add(3);
        a2.add(7);
        System.out.println(a2);
        a1.add(33);
        a1.add(17);
        a1.add(24);
        a1.add(17);
        a1.add(33);
        System.out.println(a1);

        ///..Add two list..//
        a1.addAll(a2);
        System.out.println(a1);

        ///...Add ele in B/w..//
        a1.add(6,72);
        System.out.println(a1);

        ///..Change value at any index..///
        a1.set(5,69);
        System.out.println(a1);

        //..Delete element..//
        a1.remove(7);
        System.out.println(a1);

        //..Size..//
        System.out.println(a1.size());

        Collections.sort(a1);
        System.out.println(a1);
        
        // System.out.println(a1.contains(72));
        // System.out.println(a1.indexOf(17));
        // System.out.println(a1.lastIndexOf(17));
        
        //System.out.print(a1);
    }
}

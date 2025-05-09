import java.util.ArrayDeque;
public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1=new ArrayDeque<>();
        ArrayDeque<Integer> a2=new ArrayDeque<>();
        //..add element in list..//
        a2.add(1);
        a2.add(8);
        a2.add(3);
        a2.add(7);
        System.out.println(a2);
        a1.add(33);
        a1.add(17);
        a1.addFirst(24);
        a1.add(17);
        a1.add(33);
        System.out.println(a1);

        ///..Add two list..//
        a1.addAll(a2);
        System.out.println(a1);

        //..Delete element..//
        a1.remove(7);
        System.out.println(a1);

        //..Size..//
        System.out.println(a1.size());
    }
}

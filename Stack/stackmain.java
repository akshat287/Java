package SS;

public class stackmain {
    public static void main(String[] args) throws Exception {
        customstack stack=new dynamicstack();
        stack.push(45);
        stack.push(487);
        stack.push(67);
        stack.push(983);
        stack.push(1724);

        stack.push(45);
        stack.push(487);
        stack.push(67);
        stack.push(983);
        stack.push(1724);

        stack.push(17);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        
       

    }
}

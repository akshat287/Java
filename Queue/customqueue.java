package Queue;

public class customqueue {
    protected int []data;
    private static final int DEFAULT_SIZE=8;

    int ptr=-1;

    public boolean isfull(){
        return ptr==data.length-1;
    }

    public boolean isempty(){
        return ptr==-1;
    }

    public int size(){
        return ptr+1;
    }

    public customqueue(){
        this(DEFAULT_SIZE);
    }

    public customqueue(int size){
        this.data=new int[size];
    }

    public boolean add(int n){
        if(isfull()){
            System.out.println("Queue is full.!!");
            return false;
        }
        ptr++;
        data[ptr]=n;
        return true;
    }

    public int poll() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int num=data[0];
        for(int i=1;i<data.length;i++){
            data[i-1]=data[i];
        }
        ptr--;
        return num;
    }

    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public static void main(String[] args) throws Exception {
        customqueue q1=new customqueue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        // q1.add(4);
        // q1.add(5);
        // q1.add(6);
        // q1.add(7);
        // q1.add(8);
        // q1.add(9);
        // q1.add(10);
        
        System.out.println(q1.peek());
        System.out.println(q1.size());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.peek());
        q1.add(9);
        System.out.println(q1.size());
        
    }
}

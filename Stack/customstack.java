package SS;

public class customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr=-1;

    public customstack(){
        this(DEFAULT_SIZE);
    }

    public customstack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isfull()){
            System.out.println("Stack Is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean isfull(){
        return ptr==data.length-1;
    }

    private boolean isempty(){
        return ptr==-1;
    }
}

package SS;

public class dynamicstack extends customstack {
    
    public dynamicstack(){
        super();
    }

    public dynamicstack(int size){
        super(size);
    }

    //@Override
    public boolean push(int item){
        if(this.isfull()){
            //doble the arry size
            int[] temp=new int[data.length*2];
            
            //copy arr elements
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        //insert item
        return super.push(item);
    }
}

package LinkedList;

public class DL {
    Node head;
    private int size;

    DL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
            size++;
        }
    }

    public void af(String data){
        Node nn= new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        head.next=nn;
        nn.prev=head;
        return;
    }

    public void al(String data){
        Node nn= new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=nn;
        nn.prev=n;
    }

    public void ai(String data, int idx){
        Node nn= new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node n=head;
        int cnt=1;
        while((idx-1)>cnt++){
            n=n.next;
        }
        nn.next=n.next;
        n.prev=nn;
        n.next=nn;
        nn.prev=n;
    }

    public void df(){
        if(head==null || head.next==null)return;
        Node n=head;
        head=head.next;
        n.next=null;
        head.prev=null;
    }
    
    public void dl(){
        if(head==null || head.next==null)return;
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.prev.next=null;
        n.prev=null;
    }

    public void di(int idx){
        if(head==null || head.next==null)return;
        Node n=head;
        int cnt=1;
        while(idx>cnt){
            n=n.next;
        }
        n.prev.next=n.next;
        n.next.prev=n.prev;
        n.next=null;
        n.prev=null;
    }

    public void rev(){
        if(head==null || head.next==null)return;
        Node n=head;
        Node prev=null;
        Node nn=n.next;
        while(n!=null){
            n.prev=nn;
            n.next=prev;
            prev=n;
            n=n.next;
            if(n==null)break;
            nn=n.next;
        }
        head=prev;
    }

    
}

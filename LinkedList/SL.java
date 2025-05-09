package LinkedList;

public class SL {
    Node head;
    private int size;

    SL(){
        this.size=0;
    }
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //...ADD...//
    public void addf(String data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }

    public void addl(String data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node cn=head;
        while(cn.next!=null){
            cn=cn.next;
        }
        cn.next=nn;
    }

    public void addat(String data,int n){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node cn=head;
        int s=1;
        while(s++!=n-1){
            cn=cn.next;
        }
        nn.next=cn.next;
        cn.next=nn;
    }

    public void addfromlast(String data, int n,int size){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node cn=head;
        int s=0;
        while(s++!=size-n){
            cn=cn.next;
        }
        nn.next=cn.next;
        cn.next=nn;
    }

    //...Traverse...//
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node cr=head;
        while(cr!=null){
            System.out.print(cr.data+" -> ");
            cr=cr.next;
        }
        System.out.println("null");
    }

    //...Delete...//
    public void deletef(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    public void deletel(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node cr=head;
        Node ln=head.next;
        while(ln.next!=null){
            ln=ln.next;
            cr=cr.next;
        }
        cr.next=null;
    }

    public void deletefromlast(int n,int size){
        Node cr=head;
        int s=1;
        while(s++!=size-n){
            cr=cr.next;
        }

        cr.next=cr.next.next;
    }

    //...Size..//
    public int getsize(){
        return size;
    }

    //..Reverse..//

    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node cr=head.next;
        while(cr!=null){
            Node nn=cr.next;
            cr.next=prev;
            //update
            prev=cr;
            cr=nn;
        }
        head.next=null;
        head=prev;
    }

    public Node recreverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node nh=recreverse(head.next);
        head.next.next=head;
        head.next=null;
        return nh;
        
    }


    public static void main(String[] args) {
        SL l1=new SL();
        l1.addf("Shruti");
        l1.addf("Reena");
        //l1.addl("Aditi");
        //l1.addf("unknown");
        l1.print();
        System.out.println(l1.getsize());
        l1.reverse();
        l1.print();

        // l1.deletef();
        // l1.print();

        // l1.deletel();
        // l1.print();
        // System.out.println(l1.getsize());

        l1.addl("Amisha");
        l1.addl("Banshika");
        l1.print();
        //System.out.println(l1.getsize());
        l1.head=l1.recreverse(l1.head);
        l1.print();

        l1.addat("Anshu",5);
        l1.print();
        System.out.println(l1.getsize());
        l1.addfromlast("Aastha",4,7);
        l1.print();
        l1.deletefromlast(6,l1.getsize());
        l1.print();


    }

}

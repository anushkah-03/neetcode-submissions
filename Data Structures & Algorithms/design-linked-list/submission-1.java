class Node {
    int val;
    Node next;
    Node(int v){
        val=v;
        next=null;
    }
}
class MyLinkedList{
    Node head;
    MyLinkedList(){
        head=null;
    }
    void addAtHead(int val){
        Node newnode =new Node(val);
        newnode.next=head;
        head=newnode;
    }
    int get(int index){
        Node current=head;
        for(int i=0;i<index;i++){
            if(current==null){
                return -1;
            }
            current=current.next;
        }
        if(current==null){
                return -1;
        }
        return current.val;
    }
    void addAtTail(int val){
        Node current =head;
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }
    void addAtIndex(int index,int val){
        Node current = head;
        if(index==0){
            addAtHead(val);
            return;
        }
        for(int i=0;i<index-1;i++){
            if(current == null){
                return;
            }
            current=current.next;
        }
        Node newnode = new Node(val);
        newnode.next=current.next;
        current.next=newnode;
    }
    void deleteAtIndex(int index){
        Node current = head;
        if(index==0){
            if(head!=null){
                head=head.next;
            }
            return;
        }
        for(int i=0;i<index-1;i++){
            if(current==null){
                return;
            }
            current=current.next;
        }
        if(current==null||current.next==null){
            return;
        }
        current.next=current.next.next;
    }
}
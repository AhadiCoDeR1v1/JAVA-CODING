package LL.Doubly;

public class DLL {
   private Node head;
   private int size;
   public DLL() {
       this.size=0;
   }
    public void insertatfirst(int value){
        Node node =new Node(value);
        if(head==null){
            head=node;
            size++;
            return;
        }
        else{
            node.prev=head.prev;
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }
    public void display(){
        Node node =head;
        while(node!=null){
            System.out.print(node.val + " -> ");
            node=node.next;
        }
    }
    public void insertatspec(int index,int valuetoinsert){
       Node node =new Node(valuetoinsert);
       if(head==null){
           head=node;
           size++;
           return;
       }
       else{
           Node temp=head;
           int tempindex=0;
           while(tempindex!=index-1){
               temp=temp.next;
               tempindex++;
           }
           node.next=temp.next;
           temp.next=node;
           node.prev=temp;
           node.next.prev=node;

           size++;
       }
    }
    private class Node {
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

package LL.Doubly;

public class DLL {
    Node head;
    public void insertatfirst(int value){
        Node node =new Node(value);
        if(head==null){
            head=node;
            return;
        }
        else{
            node.prev=head.prev;
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void display(){
        Node node =head;
        while(node!=null){
            System.out.println(node.val + " -> ");
            node=node.next;
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


// here i am learn delete element from linked list 
public class ll3 {
    Node head;
    class Node{
        int data; 
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
            return;
        }
        node.next =head;
        head = node;   
    }

    //here  i am writing code for delete element from linked list
    // delete from first (head)
    public void deleteFirst(){
        Node node = head; 
        if(head==null){
            System.out.print("The Given Linked list is empty ");
            return;
        }
        if(head.next==null){
            head= null;
            return;
        }
        head = node.next;
    }
    // delete from last(tail)
    @SuppressWarnings("unused")// automatic added
    public void deleteLast(){
        Node node = head;
        if(head==null){
            System.out.println("The list is empty ");
            return;
        }
        if(head.next==null ){
            node=null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next =null;
    }

    // delete from given index
    public void deleteGivenIndex(int index){
        Node node = head;
        if(head==null){
            System.out.println("given list is empty ");
            return;
        }
        if(head.next == null){
            head=null;
            return;
        }
        int count =0; 
        while(node.next!=null && count< index-1){
            node = node.next;
            count++;
        }
        node =null;
    }
    public void print(){
        Node node = head;
        while(node!= null){
        System.out.print(node.data+" -> ");
        node = node.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        ll3 list = new ll3();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.print();
        list.deleteFirst();
        list.print();
        // list.deleteFirst();
        // list.print();
        // list.deleteFirst();
        // list.deleteLast();
        // list.print();
        list.deleteGivenIndex(2);
        list.print();

    }

}

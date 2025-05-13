public class ll2 {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public void addGivenIndex(int index, int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
            return;
        }
        if(head.next==null){
            head.next= node;
            return;
        }
       Node curr = head;
       int count =0;
       while(curr!= null && count < index-1){
        curr = curr.next;
        count++;
       }
        node.next = curr.next;
        curr.next = node;
       
    }
    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args){
        ll2 list = new ll2();
        list.addGivenIndex(0, 10);
        list.addGivenIndex(1, 20);
        list.addGivenIndex(2, 40);
        list.addGivenIndex(3, 50);
        list.printList();
        list.addGivenIndex(2, 100);
        list.printList();

    }
}

public class ll1 {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //Add element to First position
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
// Add element to last position
        // Time complexity is O(n) and space complexity is O(1)
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head==null){
               head = newNode;
               return;
            }
            Node currNode = head;
            while(currNode.next!= null){
                currNode = currNode.next;
            }
            currNode.next = newNode;

        }   
// print the list 
        public void printList(){
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }
            System.out.println("example");
        }

    //Delete element from frist position
    public void deleteFirst(){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
    }
    //delete last element from list 
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node last= head.next;
        while(last.next!=null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
   
    public static void main(String[] args){
        ll1 list = new ll1();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();

        list.addLast("LinkedList");

        list.printList();

        list.addFirst("This");

        list.printList();

        list.deleteFirst();

        list.printList();

        list.deleteLast();
        list.printList();

    }
}

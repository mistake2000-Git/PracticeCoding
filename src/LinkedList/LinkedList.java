package LinkedList;

public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public Node(){};
    }
    public static class LinkedListNode{
        Node head = null;
        public LinkedListNode(){};
    }

    public void insertAtFirst(LinkedListNode list, int data){
        Node newNode = new Node(data);
        Node p1 = list.head;
        if(list.head==null){
            list.head = newNode;
        }
        else{
            newNode.next = p1;
            list.head = newNode;
        }
    }

    public void bubbleSort(LinkedListNode list)
    {
        int count = 0 ;
        boolean isSwapped;
        Node p2,p1 = list.head;
        while(p1!= null)
        {
            count++;
            p1 = p1.next;
        }
        for(int i = 0 ; i < count -1;i++)
        {
            p1 = list.head;
            p2 = p1.next;
            isSwapped =false;
            for(int j = 0 ; j < count-i-1;j++)
            {
                if(p1.data > p2.data)
                {
                    int temp = p1.data;
                    p1.data = p2.data;
                    p2.data = temp;
                    isSwapped =true;
                }
                p1 = p1.next;
                p2= p2.next;
            }
            if(isSwapped =false){
                break;
            }
        }

    }
    public static void printList(LinkedListNode list){
        Node p = list.head;
        while(p!=null){
            System.out.println(p.data);
            p=p.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedListNode listNode = new LinkedListNode();
        list.insertAtFirst(listNode,90);
        list.insertAtFirst(listNode,11);
        list.insertAtFirst(listNode,22);
        list.insertAtFirst(listNode,12);
        list.insertAtFirst(listNode,25);
        list.insertAtFirst(listNode,34);
        list.insertAtFirst(listNode,64);
        list.bubbleSort(listNode);
        printList(listNode);
    }




}

package Array;

import java.sql.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class Lesson2 {
    static class Node {
       public  int data;
        public Node next=null;

        public Node(int data) {
            this.data = data;
        }
        public Node(){};
    }
    static class LinkedList
    {
        public Node head = null;
        public Node tail = null;

        public LinkedList(Node head, Node tail) {
            this.head = head;
            this.tail = tail;
        }
    }
    public static void addFirst(Node node,LinkedList list){
        if(list.head==null){
            list.head = node;
            list.tail = node;
        }else{
            node.next = list.head;
            list.head = node;
        }
    }
    public static void inserAtPos(Node node,LinkedList list,int position)
    {
        Node p = new Node();
        p = list.head;
        int count = 0;
        while(p.next!=null || count==position)
        {
            p =p.next;
            count++;
        }
        

    }
    public static void printList(LinkedList list){
        Node p = new Node();
        p = list.head;
        while(p!=null){
           System.out.print(p.data);
           p=p.next;
        }
    }
    public static boolean isCycle(LinkedList list)
    {
        Node p = list.head;
        Node p1;
        while(p.next!= null)
        {
            p1 = p.next;
            while(p1.next!=null){
                if(p1.next == p)
                {
                    return true;
                }
                p1 = p1.next;
            }
            p=p.next;
        }
        return false;

    }
    public static void main(String[] args) {
        Node newNode = new Node(10);
        LinkedList list = new LinkedList(null,newNode);
        addFirst(new Node(10),list);
        addFirst(new Node(9),list);
        addFirst(newNode,list);
        addFirst(new Node(7),list);
        addFirst(new Node(6),list);
        addFirst(new Node(5),list);
        printList(list);
        System.out.println("Is cycle" + isCycle(list));
    }

}

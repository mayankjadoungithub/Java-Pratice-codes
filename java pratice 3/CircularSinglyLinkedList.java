import java.util.*;
public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data=data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularSinglyLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(10);
        ListNode fifth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        last = fifth;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);

    }

public static void main(String []a) {
    CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
    cll.createCircularSinglyLinkedList();
    cll.display();
    
}
}
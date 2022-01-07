package Array2;

public class circularLinkedList {
    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;

        }
    }

    public circularLinkedList() {
        last = null;
        length = 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }
    public void insertFirst(int data){
        ListNode temp=new ListNode(data);
        if(last == null){
            last=temp;
        }
        else{
            temp.next=last.next;

        }
        last.next=temp;
        length++;

    }
    public void insertLast(int data){
        ListNode temp=new ListNode(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }
    public void display() {


        if (last == null) {
            return;

        }
        ListNode first = last.next;
        while (first != last) {
            System.out.println(first.data + "-->");
            first = first.next;
        }
        System.out.println(first.data + "");
    }

public static void main(String[] args){
    circularLinkedList cll=new circularLinkedList();
    cll.createCircularLinkedList();
    cll.insertFirst(20);
    cll.insertFirst(35);
    cll.insertLast(85);
    cll.insertLast(02);
    cll.display();
}
}
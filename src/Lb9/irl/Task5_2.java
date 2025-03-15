package Lb9.irl;

public class Task5_2 {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node tail = head;

        for (int i = 1; i <= 9; i++) {
            Node newNode = new Node(i, null);
            tail.next = newNode;
            tail = newNode;
        }

        printList(head);
    }

    public static void printList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}

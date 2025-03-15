package Lb9.irl;

public class Task5_1 {
    public static void main(String[] args) {
        Node head = null;

        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
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

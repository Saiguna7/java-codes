import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class EvenAfterOddLinkedList1 {
    private static Node arrangeEvenOdd(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node oddHead = null;
        Node oddTail = null;
        Node evenHead = null;
        Node evenTail = null;

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            } else {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
        }

        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
            if (evenTail != null) {
                evenTail.next = null;
            }
            return oddHead;
        }
    }
    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] values = input.split(" ");
        Node head = null;
        Node tail = null;

        for (String value : values) {
            int num = Integer.parseInt(value);
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node rearrangedList = arrangeEvenOdd(head);
        printLinkedList(rearrangedList);
    }
}
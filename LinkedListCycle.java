import java.util.Scanner;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {
    SinglyLinkedListNode head;
    
    int hasCycle() {
        if (head == null || head.next == null) {
            return 0;
        }

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        LinkedListCycle l = new LinkedListCycle();
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            int num = Integer.parseInt(element);
            if (num == -1) {
                break;
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(num);
            if (l.head == null) {
                l.head = newNode;
            } else {
                SinglyLinkedListNode current = l.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        int hasCycle = l.hasCycle();
        System.out.println(hasCycle);
    }
}

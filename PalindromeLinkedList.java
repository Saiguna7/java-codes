import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class PalindromeLinkedList {
    Node head;
        private  boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (prev != null && slow != null) {
            if (prev.data != slow.data) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;
        }
    public static void main(String[] args) {
        PalindromeLinkedList l=new PalindromeLinkedList();
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            int num = Integer.parseInt(element);
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            if (l.head == null) {
                l.head = newNode;
            } else {
                Node current = l.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        boolean isPalindrome = l.isPalindrome();
        System.out.println(isPalindrome);
    }
}


        
    
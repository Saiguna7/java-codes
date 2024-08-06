import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class EvenAfterOddLinkedList {
    Node head;

    public void arrange() {
        if (head == null || head.next == null) {
            return;
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
            head = evenHead;
        } else {
            oddTail.next = evenHead;
        }

        if (evenTail != null) {
            evenTail.next = null;
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EvenAfterOddLinkedList list = new EvenAfterOddLinkedList();
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            int num = Integer.parseInt(element);
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            if (list.head == null) {
                list.head = newNode;
            } else {
                Node current = list.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        list.arrange();
        list.display();
    }
}

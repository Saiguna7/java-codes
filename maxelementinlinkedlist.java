import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class maxelementinlinkedlist {
    Node head;
    public int max()
    {
        if (head == null) {
            return 0;
        }
        int largest = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > largest) {
                largest = current.data;
            }
            current = current.next;
        }
        return largest;
    }
    public static void main(String[] args) {
     maxelementinlinkedlist list = new maxelementinlinkedlist();
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
        System.out.print(list.max());
    }
}

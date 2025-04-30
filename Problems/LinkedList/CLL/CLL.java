public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }

        if (current.next == head) {
            insertAtEnd(data);
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteAtFirst() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = head;
            tail = current;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        if (position == 0) {
            deleteAtFirst();
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }

        if (current.next == head) {
            return;
        }

        current.next = current.next.next;
        if (current.next == head) {
            tail = current;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertAtFirst(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        list.insertAtPosition(15, 1);
        list.display();

        list.deleteAtFirst();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.deleteAtPosition(1);
        list.display();
    }
}

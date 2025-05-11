import java.util.*;

public class MyLinkedList {

    public static void main(String[] args) {
        System.out.println("Problem 1: Add and Access Elements");
        problem1();
        
        System.out.println("\nProblem 2: Iterate and Modify Elements");
        problem2();
        
        System.out.println("\nProblem 3: LinkedList Operations");
        problem3();
        
        System.out.println("\nProblem 4: Queue Behavior with LinkedList");
        problem4();
        
        System.out.println("\nProblem 5: Reverse LinkedList");
        problem5();
    }

    // Problem 1: Add and Access Elements
    public static void problem1() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
    }

    // Problem 2: Iterate and Modify Elements
    public static void problem2() {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        
        // Find and replace "three" with "THREE"
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("three")) {
                list.set(i, "THREE");
            }
        }
        
        System.out.println("Modified list:");
        list.printList();
    }

    // Problem 3: LinkedList Operations
    public static void problem3() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        
        list.remove(2);  // Remove third element (index 2)
        list.removeLast(); // Remove last element
        
        System.out.println("Resulting list:");
        list.printList();
    }

    // Problem 4: Queue Behavior with LinkedList
    public static void problem4() {
        CustomLinkedList<String> queue = new CustomLinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");
        
        System.out.println("Removed: " + queue.removeFirst());
        System.out.println("Removed: " + queue.removeFirst());
        
        System.out.println("Remaining in queue:");
        queue.printList();
    }

    // Problem 5: Reverse LinkedList
    public static void problem5() {
        CustomLinkedList<Character> list = new CustomLinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        
        System.out.println("Original list:");
        list.printList();
        
        list.reverse();
        
        System.out.println("Reversed list:");
        list.printList();
    }
}

class CustomLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    public CustomLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add to end of list
    public void add(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Get element at index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Set element at index
    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }

    // Get first element
    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    // Get last element
    public T getLast() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }
        return tail.data;
    }

    // Remove first element
    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return data;
    }

    // Remove last element
    public T removeLast() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }
        
        T data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return data;
    }

    // Remove element at index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        return current.data;
    }

    // Get list size
    public int size() {
        return size;
    }

    // Reverse the list
    public void reverse() {
        Node temp = null;
        Node current = head;
        
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Print the list (for demonstration)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
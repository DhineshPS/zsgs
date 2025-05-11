public class MyArrayList<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    // Add an element to the list
    public void add(T element) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = element;
    }

    // Get an element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) array[index];
    }

    // Remove an element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;  // Clear the last element
        size--;
    }

    // Find the size of the list
    public int size() {
        return size;
    }

    // Increase the capacity of the array when it's full
    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Display the elements in the list
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method to test our custom MyArrayList
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Display the list
        System.out.println("ArrayList elements:");
        myList.display();

        // Retrieve an element at index 1
        System.out.println("Element at index 1: " + myList.get(1));

        // Remove an element at index 1
        myList.remove(1);
        System.out.println("After removing element at index 1:");
        myList.display();

        // Print the size of the list
        System.out.println("Size of the list: " + myList.size());
    }
}

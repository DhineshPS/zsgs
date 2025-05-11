public class MyArrayList {

    public static void main(String[] args) {
        System.out.println("Problem 1: Add and Retrieve Elements");
        problem1();
        
        System.out.println("\nProblem 2: Iterate and Remove Elements");
        problem2();
        
        System.out.println("\nProblem 3: Search for an Element");
        problem3();
        
        System.out.println("\nProblem 4: Sort an ArrayList");
        problem4();
        
        System.out.println("\nProblem 5: Convert ArrayList to Array and Vice Versa");
        problem5();
    }

    // Problem 1: Add and Retrieve Elements
    public static void problem1() {
        CustomArrayList<String> fruits = new CustomArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        
        System.out.println("Third fruit: " + fruits.get(2));
    }

    // Problem 2: Iterate and Remove Elements
    public static void problem2() {
        CustomArrayList<Integer> numbers = new CustomArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        // Remove elements greater than 30
        for (int i = 0; i < numbers.size(); ) {
            if (numbers.get(i) > 30) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        
        System.out.println("Modified list:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    // Problem 3: Search for an Element
    public static void problem3() {
        CustomArrayList<Character> chars = new CustomArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        chars.add('F');
        chars.add('G');
        chars.add('H');
        chars.add('I');
        chars.add('J');
        
        char searchChar = 'D';
        int index = -1;
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) == searchChar) {
                index = i;
                break;
            }
        }
        System.out.println("Index of '" + searchChar + "': " + index);
    }

    // Problem 4: Sort an ArrayList
    public static void problem4() {
        CustomArrayList<Integer> numbers = new CustomArrayList<>();
        // Adding 10 random numbers between 1 and 100
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(34);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        numbers.add(56);
        numbers.add(90);
        numbers.add(5);
        
        System.out.println("Before sorting:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        
        // Bubble sort implementation
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Swap elements
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    // Problem 5: Convert ArrayList to Array and Vice Versa
    public static void problem5() {
        CustomArrayList<String> fruits = new CustomArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        
        // Convert to array
        String[] array = new String[fruits.size()];
        for (int i = 0; i < fruits.size(); i++) {
            array[i] = fruits.get(i);
        }
        
        System.out.println("Array contents:");
        for (String item : array) {
            System.out.println(item);
        }
        
        // Convert back to CustomArrayList
        CustomArrayList<String> newList = new CustomArrayList<>();
        for (String item : array) {
            newList.add(item);
        }
        
        System.out.println("\nCustomArrayList contents:");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}

class CustomArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elements[index] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public int size() {
        return size;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
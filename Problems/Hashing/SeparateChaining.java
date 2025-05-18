import java.util.LinkedList;

public class SeparateChaining {

    static final int SIZE = 10;
    static LinkedList<Integer>[] table = new LinkedList[SIZE];

    public static void main(String[] args) {
        initialize();

        insert(15);
        insert(25);
        insert(35);
        insert(5);
        insert(7);
        insert(17);

        printHashTable();

        delete(25);
        printHashTable();

        System.out.println("Search 35: " + (search(35) ? "Found" : "Not Found"));
        System.out.println("Search 100: " + (search(100) ? "Found" : "Not Found"));
    }

    public static void initialize() {
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public static int hash(int key) {
        return key % SIZE;
    }

    public static void insert(int key) {
        int index = hash(key);
        if (!table[index].contains(key)) {
            table[index].add(key);
        }
    }

    public static void delete(int key) {
        int index = hash(key);
        table[index].remove(Integer.valueOf(key));
    }

    public static boolean search(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    public static void printHashTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + ": ");
            for (int val : table[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

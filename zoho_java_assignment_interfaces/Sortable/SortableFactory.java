public class SortableFactory {
    public static Sortable getSort(String sortChoice) {
        switch(sortChoice) {
            case "1" -> {
                return new BubbleSort();
            }
            case "2" -> {
                return new QuickSort();
            }
            case "3" -> {
                return new MergeSort();
            }

            default -> {
                System.out.println("Quick sort is default");
                return new QuickSort();
            }
        }
    }
}

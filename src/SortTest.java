public class SortTest {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] array = sort.createArray();
        sort.printArray(array);
        sort.sortArray(array);
        sort.printArray(array);

    }
}

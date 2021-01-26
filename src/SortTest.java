public class SortTest {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 5, 1, 7}; // liczba porównań = 10
        int[] array2 = {1, 2, 3, 4, 5}; // liczba porównań = 4
        int[] array3 = {3, 2, 1};       // liczba porównań = 3
        int[] array4 = new int[100];    // liczba porównań = 4950
        int[] array5 = new int[100];    // liczba porównań = 99
        for (int i = 0; i < array4.length; i++) {
            array4[i] = 100 - i;
        }
        for (int i = 0; i < array5.length; i++) {
            array5[i] = i;
        }
        Sort sort = new Sort();
        sort.sortArray(array5);
        sort.printArray(array5);
    }
}

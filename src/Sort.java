public class Sort {

    public void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d |", i);
        }
        System.out.println();
    }
}

public class Sort {

    public void sortArray(int[] array) {
        int counter = 0;
        boolean isSwap = true;
        for (int i = 0; i < array.length - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    isSwap = true;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Liczba porownan " + counter);
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d |", i);
        }
        System.out.println();
    }
}

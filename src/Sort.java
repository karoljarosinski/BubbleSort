import java.util.Scanner;

public class Sort {

    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public void sortArray(int[] array) {
        int tmp;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                tmp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tmp;
                i = 0;
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

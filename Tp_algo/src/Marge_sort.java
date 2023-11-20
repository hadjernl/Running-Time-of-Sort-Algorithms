import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Marge_sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        int[] array = generateRandomArray(n);

        System.out.println("Original array:");
        printArray(array);

        long startTime = System.currentTimeMillis();
        mergeSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("\nSorted array:");
        printArray(array);

        // Calculate and print execution time
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    public static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // Adjust the range as needed
        }

        return array;
    }

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

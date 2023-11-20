import java.util.Random;
import java.util.Scanner;

public class QuickSortExample {

    public static void main(String[] args) {
        int v[] = new int[100000000];
        int n;
        Random rand = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of table:");
        n = scanner.nextInt();

        // Fill array with random values
        for (int i = 0; i < n; i++) {
            v[i] = rand.nextInt(100); // Adjust the range as needed
        }
        long startTime = System.currentTimeMillis();

        // Print original array
        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }

        // Call the QuickSort algorithm
        quickSort(v, 0, n - 1);

        long endTime = System.currentTimeMillis();

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        // Calculate and print execution time
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    // QuickSort algorithm
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Recursively sort the elements before and after the partition index
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Partition function for QuickSort
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

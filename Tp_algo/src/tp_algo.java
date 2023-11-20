import java.util.Random;
import java.util.Scanner;

public class tp_algo {

	public static void main(String[] args) {
	

		        int[] v = new int[10000000];
		        int n;

		        // Seed for random numbers
		        Random rand = new Random(System.currentTimeMillis());

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elments of table: ");
		        n = scanner.nextInt();

		        // Fill array with random values
		        for (int i = 0; i < n; i++) {
		            v[i] = rand.nextInt(100); // Adjust the range as needed
		        }
		        long startTime = System.currentTimeMillis();

		        // Print original array
		        System.out.print("Original array: ");
		        for (int i = 0; i < n; i++) {
		            System.out.print(v[i] + " ");
		        }
		        System.out.println();


		        for (int i = 0; i < n; i++) {
		            for (int j = i + 1; j < n; j++) {
		                if (v[i] > v[j]) {
		                    int temp = v[i];
		                    v[i] = v[j];
		                    v[j] = temp;
		                }
		            }
		        }

		     // Measure execution time for sorting
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



    
}

	
	



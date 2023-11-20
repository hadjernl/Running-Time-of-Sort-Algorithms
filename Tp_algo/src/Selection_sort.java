import java.util.Random;
import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int v[] = new int[100000000];
		    int n;
		      Random rand = new Random(System.currentTimeMillis());
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Enter the number of elements of table:");
		   n= scanner.nextInt();

		   

		   // Fill array with random values
	        for (int i = 0; i < n; i++) {
	            v[i] = rand.nextInt(100); // Adjust the range as needed
	        }
	        long startTime = System.currentTimeMillis();



		 

		    // Print original array
		    System.out.println("Original array: ");
		    for (int i = 0; i < n; i++) {
		    	 System.out.println( v[i]);
		    }
	
		    for (int i = 0; i < n - 1; i++) {
		        int minIndex = i;

		        for (int j = i + 1; j < n; j++) {
		            if (v[j] < v[minIndex]) {
		                minIndex = j;
		               
		            }
		        }

		        // Swap elements if needed
		        if (minIndex != i) {
		            int temp = v[i];
		            v[i] = v[minIndex];
		            v[minIndex] = temp;
		        }
		    }

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
package algoritmosOrdenamiento;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int[] vector) {
	    for (int i = 1; i < vector.length; i++) {
	        int key = vector[i];
	        int j = i - 1;

	        // Shift elements greater than the key one position to the right
	        while (j >= 0 && vector[j] > key) {
	            vector[i] = vector[j];
	            j--;
	        }

	        // Insert the element (key) in its correct position
	        vector[j + 1] = key;
	    }

	    return vector;
	}
}

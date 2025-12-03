package algoritmosOrdenamiento;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int[] vector) {
	    for (int i = 1; i < vector.length; i++) {
	        int key = vector[i];
	        int j = i - 1;

	        // Mover elementos mayores un lugar a la derecha
	        while (j >= 0 && vector[j] > key) {
	            vector[i] = vector[j];
	            j--;
	        }

	        // Insertar el elemento en su posición correcta
	        vector[j + 1] = key;
	    }

	    return vector;
	}
}

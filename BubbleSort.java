package algoritmosOrdenamiento;

import java.util.Arrays;

public class BubbleSort {

	
	public static int[] bubbleSort(int[] vector) {
		boolean sorted = false;
		int tmp = 0;
		
		while (!sorted) {
			
			sorted = true; 
			
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i+1]) {
					tmp = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = tmp;
					sorted = false;
				}
			}
		}
		return vector;
	
	}
}

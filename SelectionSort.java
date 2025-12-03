package algoritmosOrdenamiento;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int[] vector) {
		
		for (int i = 0; i < vector.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[minIndex]) {
					minIndex = j;
				}
			}
			
			int tmp = vector[i];
			vector[i] = vector[minIndex];
			vector[minIndex] = tmp;
			
			
		}
		
		return vector;
		
	}
	
	public static void main(String[] args) {
		
		int [] miVector = {5,6,2,3,4, 1000, 20,23,42,52,54,45,23,12,32,32,41,24};
		
		System.out.println(Arrays.toString(selectionSort(miVector)));
		
		
	}

}

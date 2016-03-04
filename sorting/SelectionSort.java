package sorting;

public class SelectionSort {

	public static void main(String args[]) {
		int array[] = { 5, 2, 7, 4, 9, 0 };
		array = selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	private static int[] selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp;
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;

				}
			}
		}
		return array;
	}

}

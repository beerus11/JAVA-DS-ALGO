package sorting;

public class InsertionSort {
	public static void main(String args[]) {
		int array[] = { 5, 2, 7, 4, 9, 0 };
		array = insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	private static int[] insertionSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while ((j >= 0) && (temp < array[j])) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
		return array;
	}
}

package sorting;

public class BubbleSort {

	public static void main(String args[]) {
		int array[] = { 5, 2, 7, 4, 9, 0 };
		array = bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	private static int[] bubbleSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}
		return array;
	}

}

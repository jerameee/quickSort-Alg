
public class quickSortAlg {

	private int array[];
	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}

		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowIndex, int highIndex) {

		int i = lowIndex;
		int j = highIndex;

		// ID Pivot Element

		int pivot = array[lowIndex + (highIndex - lowIndex) / 2];

		// Create Two Separate Arrays

		while (i <= j) {

			/*
			 * With each iteration the program will identify one number left of the pivot
			 * element that has a greater value and identify one number right of the pivot
			 * element that has a lesser value and exchange each number to the opposite side
			 * of the pivot element.
			 */

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);

				// Move To Next Position

				i++;
				j--;

			}

		}

		// Call quickSort() Method

		if (lowIndex < j)
			quickSort(lowIndex, j);

		if (i < highIndex)
			quickSort(i, highIndex);
	}

	private void exchangeNumbers(int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		quickSortAlg sorter = new quickSortAlg();
		int[] input = { 38, 3, 26, 45, 53, 11, 1, 57, 89, 56, 72 };
		sorter.sort(input);

		for (int i : input) {

			System.out.print(i);

			System.out.print(" ");
		}
	}

}

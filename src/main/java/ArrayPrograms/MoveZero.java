package ArrayPrograms;

public class MoveZero {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 4, 7, 0, 6 };
		int index = 0;

		// move all non-zero elements to the front

		for (int num : arr) {
			if (num != 0) {
				arr[index++] = num;
			}
		}

		// Fill the remaining positions with 0

		while (index < arr.length) {
			arr[index++] = 0;
		}

		// Print the result
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}

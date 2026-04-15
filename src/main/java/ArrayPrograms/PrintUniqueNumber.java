package ArrayPrograms;

import java.util.ArrayList;

public class PrintUniqueNumber {
	public static void main(String[] args) {
		int array[] = { 4, 5, 5, 4, 5, 4, 6, 8, 2, 4, 6 };

		ArrayList<Integer> ar = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			int k = 0;

			if (!ar.contains(array[i])) {
				ar.add(array[i]);
				k++;

				for (int j = i + 1; j < array.length; j++) {
					if (array[i] == array[j]) {
						k++;
					}
				}
				//System.out.println("The number " + array[i] + " is repeated " + k + "times");
				if (k == 1) {
					System.out.println("The number " + array[i] + " is a unique number");

				}
			}

		}

	}
}

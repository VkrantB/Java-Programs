package StringPrograms;

public class ReverseOnlyLetters2 {
	public static void main(String[] args) {

		String input = "1AB2XY3";
		char[] arr = input.toCharArray();

		int start = 0;

		for (int i = 0; i <= arr.length; i++) {

			// If end of string OR non-letter found
			if (i == arr.length || !Character.isLetter(arr[i])) {

				int left = start;
				int right = i - 1;

				// Reverse letters in the current group
				while (left < right) {
					char temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}

				// Move start to next character
				start = i + 1;
			}
		}

		System.out.println("Output: " + new String(arr));
	}
}

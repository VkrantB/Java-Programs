package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class PangramStringCheck2 {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println("Total chars : " + input.length());
		input = input.toLowerCase();

		boolean result = checkPangram(input);

		if (result) {
			System.out.println("The given string is a Pangram");
		} else {
			System.out.println("The given string is a Not a Pangram");
		}

	}

	private static boolean checkPangram(String input) {
		Set<Character> charSet = new LinkedHashSet<Character>();
		char inputChar[] = input.toLowerCase().toCharArray();
		for (char c : inputChar) {
			if (Character.isLetter(c)) {
				charSet.add(c);
			}
		}
		if (charSet.size() == 26) {
			return true;
		}
		return false;

	}
}

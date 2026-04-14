package StringPrograms;

public class PrintAllEvenWordsOfString {

	public static void main(String[] args) {
		String input = "My name is Vikrant and I live in Nagpur";

		String data[] = input.split(" ");

		for (String word : data) {
			int length = word.length();

			if (length % 2 == 0) {
				System.out.println(word);
			}
		}

	}

}

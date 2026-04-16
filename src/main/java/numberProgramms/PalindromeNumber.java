package numberProgramms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 121;
		int originalNumber = number;

		int revNumber = 0;
		int lastDigit;

		while (number != 0) {
			lastDigit = number % 10;
			revNumber = revNumber * 10 + lastDigit;
			number = number / 10;

		}
		if (originalNumber - revNumber == 0) {
			System.out.println("The given number " + originalNumber + " is a Palindrome Number");
		} else {
			System.out.println("The given number " + originalNumber + " is a Not Palindrome Number");
		}
	}

}

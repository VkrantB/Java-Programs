package numberProgramms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int copyNumber = number;
		int lastDigit;
		int armstrong = 0;

		while (copyNumber != 0) {
			lastDigit = copyNumber % 10;
			armstrong = armstrong + (lastDigit * lastDigit * lastDigit);
			copyNumber = copyNumber / 10;

		}
		if (number == armstrong) {
			System.out.println("The given number "+ number + " is an armstrong number");
		} else {
			System.out.println("The given number "+ number + " is not an armstrong number");
		}

	}
}

package StringPrograms;

public class CheckEvenOddString {
	public static void main(String[] args) {

		String input = "JavaScript12";
		int data = input.length();
		

		if (data % 2 == 0) {
			System.out.println("The given number " + data + " is an EVEN number");
		} else {
			System.out.println("The given number " + data + " is an ODD number");
		}
	}
}

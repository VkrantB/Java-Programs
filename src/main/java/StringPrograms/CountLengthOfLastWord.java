package StringPrograms;

public class CountLengthOfLastWord {
	public static void main(String[] args) {
		String input = "    HelloVir World     Moonlanding      ";

		System.out.println(input);
		System.out.println(input.trim());

		int count = 0;
		char inputArray[] = input.toCharArray();
		for (int i = 0; i <= inputArray.length; i++) // for 1st word
		// for(int i=inputArray.length-1; i>=0;i--) //for last word
		{
			if (inputArray[i] != ' ') {
				count = count + 1;
			} else {
				if (count > 0) {
					System.out.println(count);
					break;
				}
			}
		}
	}
}

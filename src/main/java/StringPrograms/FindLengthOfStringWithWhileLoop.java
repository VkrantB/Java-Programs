package StringPrograms;

public class FindLengthOfStringWithWhileLoop {
	public static void main(String[] args) {
		String input="Hello World"; // Output: 11
		int count=0;
	
	while(true) {
		try {
			input.charAt(count);
			count++;
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(count);
			break;
		}
	}
	
	
	}
}

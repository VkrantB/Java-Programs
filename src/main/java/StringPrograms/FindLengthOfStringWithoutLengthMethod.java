package StringPrograms;

public class FindLengthOfStringWithoutLengthMethod {
	public static void main(String[] args) {
		String input="Hello World"; // Output: 11
		
		//System.out.println(input.length());
		
		char [] inputArray = input.toCharArray();
		System.out.println(inputArray.length);
		
		int count=0;
		for(char c: inputArray) {
			count++;
		}
		System.out.println("Length of String : "+count);
		
	}
}

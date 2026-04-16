package numberProgramms;

public class PalindromeNumberUsingStringMethod {

	public static void main(String[] args) {
		int number = 1234;
		
		//convert number to String
		String originalNumInSTring = Integer.toString(number);
		String originalNumInSTring2 = number + "";
		
		//Reverse string 
		StringBuilder sb = new StringBuilder(originalNumInSTring2);
		 String reverseString = sb.reverse().toString();
		 System.out.println(reverseString);
		 
		 //compare 2 string
		 if(originalNumInSTring.equals(reverseString)) {
			 System.out.println("Its a Palindrome");
		 } else {
			 System.out.println("Its Not a Palindrome");
		 }
	}

}

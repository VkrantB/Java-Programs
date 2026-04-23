package StringPrograms;

public class PangramStringCheck {

	public static void main(String[] args) {
		String input= "The quick brown fox jumps over the lazy dog";
		System.out.println("Total chars : " + input.length());
		input = input.toLowerCase();
		
		boolean result = checkPangram(input);
		
		if(result) {
			System.out.println("The given string is a Pangram");
		} else {
			System.out.println("The given string is a Not a Pangram");
		}

	}

	private static boolean checkPangram(String input) {
		if(input.length() < 26) {
			return false;
		}
		for(char i='a'; i<='z'; i++) {
			if(input.indexOf(i) <0) {
				return false;
			}
		}
		return true;
		
	}

}

package StringPrograms;

public class ToggleCase {
	public static void main(String[] args) {

		String input = "Hello World";

		StringBuilder sb = new StringBuilder();

		char[] data = input.toCharArray();

		for(char c:data) {
		
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
		
	} else if(Character.isLowerCase(c)) {
		sb.append(Character.toUpperCase(c));
	} else {
		sb.append(c);
	}
		}
		System.out.println("Given String :" + input);
		System.out.println("Toggled String :" + sb.toString());
	
	}
}

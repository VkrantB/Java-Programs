package StringPrograms;

public class SegregateGivemString {
	public static void main(String[] args) {
		
		String input="I @m V!kr@nt @nd 1 40ve te3t1ng";
		//String input= "1amV!kr@nt007";
		StringBuilder alphabets= new StringBuilder();
		StringBuilder numbers= new StringBuilder();
		StringBuilder specialChars= new StringBuilder();
		
		for(char ch:input.toCharArray())
		{
			if (Character.isLetter(ch)) {
				alphabets.append(ch);
			}
			else if(Character.isDigit(ch)) {
				numbers.append(ch);
			}else {
				specialChars.append(ch);
			}	
		}
		
		System.out.println(alphabets);
		System.out.println(numbers);
		System.out.println(specialChars);
	}

}

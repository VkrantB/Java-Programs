package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {
public static void main(String[] args) {
	 String input = "JavaKAKA";
	 
	char inputArray[] = input.toCharArray();
	StringBuilder sb = new StringBuilder();
	Set<Character> set = new LinkedHashSet<Character>();
	
	for (Character c : inputArray) {
		if (set.add(c)) {
			sb.append(c);
		}
	}
	System.out.println(sb);
	
}
}

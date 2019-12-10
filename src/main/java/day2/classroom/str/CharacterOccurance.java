package day2.classroom.str;

public class CharacterOccurance {

	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 'a';
		int totalCount = 0;
		// Build the logic to find the count of each
		// Pseudo Code:
		// a) Convert the String to character array
		char[] charArray = test.toCharArray();
		// b) Traverse through each character (using loop)
		for (int i = 0; i <= (test.length() - 1); i++) {
			if (charArray[i] == ch) {
				totalCount++;

			}
		}
		// c) If the given character matches the expected character (ch),
		// Then, increment totalCount
		System.out.println(
				"The no.of occurences of the character " + ch + " in the word " + test + " is : " + totalCount);
		// Print the count here
		// System.out.println("Total count of character("+ch+"): " + totalCount);

	}

}

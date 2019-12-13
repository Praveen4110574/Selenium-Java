package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDistinctCharactersUsingSet {

	public static void main(String[] args) {
		// In a given String print only distinct characters.
		// Input: Amazon India Private Limited
		// Output: AmazonIdiPrvteL

		// input is provided in a string
		String input = "Amazon India Private Limited";
		System.out.println("The input given by the user: " + input);

		// White space in the input string is removed
		String replaceAll = input.replaceAll(" ", "");
		System.out.println("The input string after removing spaces: " + replaceAll);

		// The string is CONVERTED INTO CHARACTERS AND STORED IN CHARACTER Array using
		// toCharArray() method
		char[] characters = replaceAll.toCharArray();
		// An empty set is created.
		Set<Character> inputSet = new LinkedHashSet<>();
		System.out.println("The Distinct/unique characters in the string are: ");
		// The values in the characters array is added to the empty set inputSet using
		// foreach loop.
		for (char eachChar : characters) {
			inputSet.add(eachChar);

		}

		// The values in the inputSet are printed onebyone using foreach loop.Since set
		// wont allow duplicate values,only unique values of the character array are
		// printed.g
		for (Character character : inputSet) {
			System.out.print(character);
		}
	}

}

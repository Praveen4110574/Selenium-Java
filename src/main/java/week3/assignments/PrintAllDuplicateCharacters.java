package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintAllDuplicateCharacters {

	public static void main(String[] args) {
		// In a Given String Print all the duplicate characters.
		// input: Infosys Limited
		// output: s,i
		int count = 0;

		// String input = "PayPal India";

		// input is provided in a string
		String input = "Infosys Limited";
		System.out.println("The input given by the user: " + input);

		// White space in the input string is removed
		String replaceAll = input.replaceAll(" ", "");
		System.out.println("The input string after removing spaces: " + replaceAll);

		// The string is CONVERTED INTO CHARACTERS AND STORED IN CHARACTER Array using
		// toCharArray() method
		char[] characters = replaceAll.toCharArray();

		// empty linked hash map is created.Character is taken as key and count is taken
		// as value.
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();

		// Checking if each character is present in the map.If the character is present
		// in the map,then the count of that character is increased by 1 and the
		// character (and its count) is added into thd map.
		// if character is not present in the map,add the character to the map with its
		// value as 1.
		for (char eachChar : characters) {
			if (charMap.containsKey(eachChar)) {
				count = charMap.get(eachChar) + 1;
				charMap.put(eachChar, count);
			}
			// if character is not present in the map,add the character to the map with its
			// value as 1.
			else {

				charMap.put(eachChar, 1);
			}

		}
		
		// Printing the characters of the input string and their respective
					// frequency(using Entry class present in Map class and Entry set method present in Map class concept)
					System.out.println("The characters of the input string and their respective frequency are: ");
					for (Entry<Character, Integer> eachEntry1 : charMap.entrySet()) {
						System.out.println(eachEntry1.getKey() + "---->" + eachEntry1.getValue());
					}
		
		// looping through all the characters of the input string.
		System.out.print("The Duplicate characters in the string are: ");
		for (char c : characters) {
			// if the character of input string is present in the map
			if (charMap.containsKey(c)) {
				// and if the character's value is greater than 1,print that character in
				// Console and remove that character from Map.So,entire duplicate characters are
				// printed and after that duplicate characters are also deleted.
				// The character printed is duplicate
				if (charMap.get(c) > 1) {
					System.out.print("," + c);
					charMap.remove(c);
				}
			}
		}
	}

}

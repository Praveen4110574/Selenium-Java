package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {

		// Remove duplicate characters in the given String "PayPal India"
		// IP: PayPal India
		// OP: ylindi

		int count = 0, value = 0;

		// String input = "PayPal India";

		// input is provided in a string
		String input = "Jeevanandham";
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
		for (char c : characters) {
			// if the character of input string is present in the map
			if (charMap.containsKey(c)) {
				// and if the character's value is greater than 1,remove that character.
				if (charMap.get(c) > 1) {
					charMap.remove(c);
				}
				// else add that character whose value is 1 to the map again.this charMAp is the
				// map which contains unique values wth all the duplicate values removed.
				else {
					value = charMap.get(c);
					charMap.put(c, value);
				}
			}
		}
		System.out.println(charMap);
		// Printing the keys(cHARACTERS) OF THE MAP USING FOREACH LOOP
		System.out.println("The output string after removing duplicate characters in the input string : ");
		for (Entry<Character, Integer> eachEntry : charMap.entrySet()) {
			System.out.print(eachEntry.getKey());
		}
	}

}

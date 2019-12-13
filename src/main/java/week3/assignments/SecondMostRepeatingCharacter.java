package week3.assignments;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostRepeatingCharacter {

	public static void main(String[] args) {
		// Print only the Second most repeating character in the String "PayPal India"
		// IP : "PayPal India"
		// OP: "P"
		int count = 0;
		// Input the nth most index(frequency) of the character which you want from the
		// input
		// string.
		int indexUser = 1;
		// Changing the indexUser to the index suitable for list.(As list index starts
		// from 0).
		int indexProgram = (indexUser - 1);
		int positionValue = 0;

		// String input = "PayPal India";

		// input is provided in a string
		String input = "Jeevanandham";
		System.out.println("The input given by the user: " + input);

		// White space in the input string is removed
		String replaceAll = input.replaceAll(" ", "");
		System.out.println("The input string after removing spaces: " + replaceAll);

		// The string replaceAll is CONVERTED INTO CHARACTERS AND STORED IN CHARACTER
		// Array using toCharArray() method
		char[] characters = replaceAll.toCharArray();

		// empty linked hash map is created.Characters of the characterArray is taken as
		// key and count is taken as value.
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
		// frequency(using Entry class present in Map class and Entry set method present
		// in Map class concept)
		System.out.println("The characters of the input string and their respective frequency are: ");
		for (Entry<Character, Integer> eachEntry1 : charMap.entrySet()) {
			System.out.println(eachEntry1.getKey() + "---->" + eachEntry1.getValue());
		}

		// Getting the values of the charMap usng charMap.values() method and storing
		// the values in aa list.
		List<Integer> valuesList = new LinkedList<>(charMap.values());

		/*
		 * for (Integer eachValue : values) { System.out.print(" "+eachValue); }
		 * System.out.println("The values(count of character) in the list after sorting"
		 * );
		 */

		// sorting the values of valuesList using Collections Interface's methos sort()
		Collections.sort(valuesList);

		// Reversing the values of valuesList after sorting to get the order of highest
		// occuring frequency.
		Collections.reverse(valuesList);

		/*
		 * for (Integer eachValue : valuesList) { System.out.print(" "+eachValue); }
		 * System.out.println("\n");
		 */

		// creating a Set ValuesSet and copying all the values in valuesList to
		// valuesSet to avoid duplicate values of frequency.
		Set<Integer> valuesSet = new LinkedHashSet<>(valuesList);

		/*
		 * for (Integer eachValue : valuesSet) { System.out.print(" "+eachValue); }
		 */

		// Create a new list valuesUnique and copy all the values in the valueSet
		// set.Now the list valuesUnique will have only the unique frequency values.
		List<Integer> valuesUnique = new LinkedList<>(valuesSet);

		// Find the size of the list valuesUnique
		int listSize = valuesUnique.size();

		// if the nth most frequency input provided by user(indexUser) is greater than
		// the listsize of valuesUnique list(unique frequency values),then print the
		// frequency asked by user is notapplicable.
		if (indexUser > listSize) {
			// System.out.println("\n");
			System.out.println(
					"The " + indexUser + "st most repeating character requested by you is not available in the string."
							+ "Please try some other position");
			// if the nth most frequency input provided by user(indexUser) is between 1 and
			// max size of valuesUnique List(unique frequency values),then store the value
			// of the list stored in the particular index(indexProgram) asked by user to
			// Position value variable.
			// In simple,if the nth index inputted by the user is within the size of the
			// valuesUnique List,store the value at the nth most index in positionValue
			// variable.
		} else if (indexUser > 0 && indexUser <= listSize) {
			positionValue = valuesUnique.get(indexProgram);

			// System.out.println("\n");

			System.out.println("The " + indexUser + "st most repeating character/character(s) in the string is/are:");
		}
		// If the charMap contains the Position value,then print that respective
		// keys(characters) and value(Frequency value) using Entry class and Entry set
		// map concept which is the output.
		for (Entry<Character, Integer> eachEntry2 : charMap.entrySet()) {
			// if the value @nth most index(position value) is found in charMap,then print
			// that value in console which is the output.
			if (eachEntry2.getValue() == positionValue) {
				System.out.println(
						eachEntry2.getKey() + " and its corresponding frequency is : " + eachEntry2.getValue());
			}

		}
	}

}

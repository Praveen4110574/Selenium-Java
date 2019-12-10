package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String 
		String input1 = "spot";
		//Declare another String
		String text2 = "pots";

		//build logic to check the given words are anagram or not


		// Pseudo Code
		//* a) Check length of the strings are same then
		if(input1.length()==text2.length()) {
			char[] charArray = input1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);

			Arrays.sort(charArray2);

			String str1=new String(charArray);
			String str2=new String(charArray2);
			if((str1).equals(str2)) {
				System.out.println("Both the strings "+input1+" and "+text2+" form an Anagram");
			}
			else
				System.out.println("Both the strings "+input1+" and "+text2+" does not form an Anagram");
		}
		else
			System.out.println("The input strings given are not of same length.So,they do not form an Anagram");
		// * b) Convert both Strings in to characters
		// * c) Sort Both the arrays
		// * d) Check both the arrays has same value


	}

}

package week1.assignments.optional;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// Declare a String text with the following value
		String text = "Tes12Le79af69";

		// Declare a int variable sum
		int sum = 0;


		//build a logic to get sum of all the digits from the given string


		//* Method 1
		//* Pseudo Code
		//* a) using replaceAll(), replace all the non-digits into ""
		//* b) Now, convert the String into array
		// * c) Iterate over the array and get each character
		// * d) Using Character.getNumericValue(), Change the char into int
		//* e) Add the values to sum & print

		// * Method 2
		// * Pseudo Code

		//* a) Iterate an  array over the String
		char[] charArray = text.toCharArray();
		for (char c : charArray) {
			if(Character.isDigit(c)==true) {
				sum=sum+Character.getNumericValue(c);
			}
			else
			{
				c=' ';
			}


		}
		//* b) Get each character and check if it is a number using Character.isDigit()
		//* c) Now covert char to int using Character.isDigit() and add it to sum
		//* d) Now Print the value

		System.out.println("\n The sum of digits present in the string " + text + " is :" + sum);

	}

}

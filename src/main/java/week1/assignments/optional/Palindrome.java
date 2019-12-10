package week1.assignments.optional;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String input = "Praveen";
				//Declare another String rev
				String rev = "";
				System.out.println("The original string is: "+input);
				//Build a logic to find the given string is palindrome or not
				
				 //* Pseudo Code
				 //* a) Iterate over the String in reverse order
				char[] charArray = input.toCharArray();
				for (int i =charArray.length-1; i >= 0; i--) {
					rev=rev+Character.toString(charArray[i]);
					
				}
				 //* b) Add the char into rev
				 //* c) Compare text and rev, if it is same then print palindrome 
				 
				System.out.print("The string "+input+" after reversal is: "+rev+"\n");
				if(rev.equals(input)) {
					System.out.println("The Given string "+input+" is a palindrome");
				}
				else
					System.out.println("The Given string "+input+" is not a palindrome");	
	}

}

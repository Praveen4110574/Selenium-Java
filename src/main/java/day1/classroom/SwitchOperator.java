package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=50,b=10;

		// Declare a String variable with input as operations (Tip:
		
String operations="div";
		// Initiate switch case for operations
		switch (operations) {
		case "add":
			System.out.println("Addition value: "+(a+b));
			break;
		case "sub":
			System.out.println("Subtraction value: "+(a-b));
			break;
		case "mul":
			System.out.println("Multiplication value: "+(a*b));
			break;
		case "div":
			System.out.println("Division value: "+(a/b));
			break;
		default:
			System.out.println( "The operation you asked is not valid");
			break;
		}
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}

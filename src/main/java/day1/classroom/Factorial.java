package day1.classroom;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {

		// Declare your input number
		int num=5;
		
		
		
		// Declare and initialize an integer variable by name: fact
		int fact=1;

		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = num; i>=1; i--) {
			
			fact=fact*i;
			
		}		
		System.out.println();
		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			System.out.println("The factorial of the number "+num+" :"+fact);

		//End of loop
		

		// Print factorial (fact)
	
	}

}

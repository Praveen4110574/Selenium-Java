package day1.assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		int num=999;
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int cal=0,rem,org;
		
		// Assign input into variable original 
		
		org=num;
		// Use loop to calculate: which loop to use until the number greater than 0??
		while (num!=0) {
			rem=num%10;
			cal=(cal+(rem*rem*rem));
			num=num/10;
			
			
		}
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
		System.out.println("The sum of cube of digits of the number "+org+" is: "+cal);
		if (cal==org) {
			System.out.println("The given number "+org+" is an armstrong number");
		}	
		else {
			System.out.println("The given number "+org+" is not an armstrong number");
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
		}
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			
			
		
		// Check whether calculated and original are same
		
			//When it matches print it as Armstrong number
			
		
		
		
		
		
		
		
		
		
		

	}

}

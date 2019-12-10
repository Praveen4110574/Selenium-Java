package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		// Pseudo Code:
		//a) split the words and have it in an array
		String[] split = test.split(" ");
		//b) Traverse through each word (using loop)
		for (int i = 0; i <= split.length-1; i++) {
			//actual output even position. so i%2==0
			if(i%2==1) {
				char[] charArray = split[i].toCharArray();
			
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else
				System.out.print(split[i]+" ");	
		}
		//c) find the odd index within the loop (use mod operator)
		//d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		//e) print the even position words in reverse order using another loop (nested loop)
		 
	
		
		

	}

}

package week1.assignments.optional;

public class FindAllPrimeNumbers {

	public static void main(String[] args) {
		//Declare an int variable range with value 100
		int range = 500;
		//Declare another int variable for counting
		int counter = 0;
		System.out.println("Prime numbers between 1 and "+range+" is:");
		
		//Build a logic to find all the prime numbers from 1 to 100
		
		 //* Pseudo Code
		 //* a) Iterate a loop with i from 1 to range
		  for (int i = 1; i <=range; i++) {
			  counter=0;
			//initialize another loop to divide the number i by numbers between 2 to i-1.
			  for (int j = 2; j <=i-1; j++) {
				if(i%j==0) {
					counter++;
					break;
				}
			}
			if(counter==0)

			{
				System.out.print(i + " ");

			}
		}
	// * b) Iterate another loop with j from 1 to i (nested loop)
	// * c) Check if i is divisible by j, if so, increase the count
	// * d) if count is 2, then print i
	// * e) Make sure that count is reset to 0 for each iteration
	}

}

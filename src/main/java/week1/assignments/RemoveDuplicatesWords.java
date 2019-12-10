package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java We java part of java sessions part week1";
		// Initialise an integer variable as count
		int count = 0;

		// * Pseudo code
		// * a) Split the String into array and iterate over it
		String[] split = text.split(" ");
		for (int i = 0; i <= split.length - 1; i++) {
			// reset counter to 0
			count = 0;
			{
				// * b) Initialise another loop to check whether the word is there in the array
				for (int j = i + 1; j <= split.length - 1; j++) {
					// * c) if it is available then increase and count by 1.
					if (split[i].equals(split[j])) {
						count++;
					} else
						continue;
					// * d) if the count > 1 then replace the word as ""
					if (count >= 1) {
						split[j] = "";
					}
				}
			}

		}
		// * e) print the each word
		for (int k = 0; k <= split.length - 1; k++) {
			if (!(split[k].contentEquals(""))) {
				System.out.print(split[k] + " ");
			}
		}
	}
}

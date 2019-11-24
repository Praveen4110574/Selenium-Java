package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data1 = {3,2,5,6,7,8};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
	Arrays.sort(data1);
	for (int i=0;i<data1.length-1;i++) {
		if(data1[i+1]==((data1[i])+1 )) {
			continue;
			
		}
		else
			System.out.println((data1[i]+1)+ " is the missing element of this array");
	}
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}

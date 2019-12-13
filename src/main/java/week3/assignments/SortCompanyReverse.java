package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompanyReverse {

	public static void main(String[] args) {
		// Sort the given company in reverse order (HCL, Aspire Systems, CTS )
		// output: HCL , CTS, Aspire Systems

		// Storing the company names in an ArrayList named Company
		// (Adding multiple values in the ArrayList Company using Arrays.alist() method
		// in the parameter of ArrayList)
		List<String> company = new ArrayList<>(Arrays.asList("HCL", "Aspire Systems", "CTS", "TCS", "Infosys",
				"MindTree", "Capegemini", "Wipro", "Tech Mahindra", "Zoho"));

		// displaying company names of ArrayList before sorting
		System.out.println("The company names before sorting: ");
		for (String eachCompany : company) {
			System.out.println(eachCompany);
		}

		// To sort the Arraylist Company,call the class Collection which contains the
		// method sort().Input the arrayist name in the parameter of sort method
		// String.CASE_INSENSITIVE_ORDER PARAMETER IN THE METHOD SORT IGNORES THE CASE
		// SENSITIVITY AND SORTS THE COMPANY NAMES IN THE CORRECT ALPHABETICAL ORDER
		Collections.sort(company, String.CASE_INSENSITIVE_ORDER);

		// displaying company names of ArrayList after sorting
		System.out.println("The company names after sorting: ");
		for (String eachCompany : company) {
			System.out.println(eachCompany);
		}

		// Reversing the elements using Collection Class's method Reverse()
		Collections.reverse(company);

		// displaying company names of ArrayList after reversing
		System.out.println("The company names after reversing: ");
		for (String eachCompany : company) {
			System.out.println(eachCompany);
		}

	}

}

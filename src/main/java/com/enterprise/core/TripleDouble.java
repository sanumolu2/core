package com.enterprise.core;

import java.util.regex.Pattern;

public class TripleDouble {

	public int find(int first, int second) {
		// convert to strings

		String s1 = Integer.toString(first);
		char a[] = s1.toCharArray();

		String s2 = Integer.toString(second);
		char b[] = s2.toCharArray();

		// loop thru first string chars to find 3 consecutive same char
		int count = 1;
		int count2 = 0;
		int repeatDigit = 0;
		int repeatDigit2 = 0;
		int result = 0;
// consecutive search for 3 digits in a 
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 2)
			{

				if (a[i] == a[i + 1])
				{

					count++;
				
				if (a[i + 1] == a[i + 2]) 
				{
					count++;
				}
					repeatDigit = a[i];
				}
				
			}
		}
// consecutive search in b
		for (int j = 0; j < b.length; j++) {
			if (j < b.length - 1) {

				if (b[j] == b[j + 1]) 
				{
					count2++;
					repeatDigit2 = b[j];

				}
			}
		}
// comparing the digit and count
		if (repeatDigit == repeatDigit2 && count == count2 + 1) {
			
			result = 1;
		}

		

		return result;

	}

}

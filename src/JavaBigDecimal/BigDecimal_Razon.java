package bigNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigDecimal_Razon {
	public static void main(String[] argh) {
		// Input
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		// Write your code here
		for (int i = 0; i < n; i++) {
			int index = i;

			for (int j = i + 1; j < n; j++) {

				java.math.BigDecimal bi2 = new java.math.BigDecimal(s[j]);
				java.math.BigDecimal bi3 = new java.math.BigDecimal(s[index]);

				if (bi2.compareTo(bi3) > 0)
					index = j;
			}
			String smallerNumber = s[index];
			s[index] = s[i];
			s[i] = smallerNumber;

		}
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}

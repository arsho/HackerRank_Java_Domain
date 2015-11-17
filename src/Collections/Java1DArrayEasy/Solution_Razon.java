package Java1DArrayEasy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_Razon {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(" ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int myList[] = new int[n];
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = scanner.nextInt();
		}
		
		int sum = 0, countNegative=0;
		
		for (int i = 0; i < myList.length; i++) {
			for (int j = i; j < myList.length; j++) {
				
				
					sum+=myList[j];
					if (sum<0) {
						countNegative++;
					}
				
				
			}
			sum = 0;
			
		}
		
		System.out.println(countNegative);
		
		
	}


}
/*
5
1 -2 4 -5 1

*/
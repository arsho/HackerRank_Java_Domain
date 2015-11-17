package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(" ");
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

	}

	private static boolean isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		
		String straightA,StraightB;
		
		straightA = straight(a.toLowerCase()).toLowerCase();
		StraightB = straight(b.toLowerCase()).toLowerCase();
		
	
		
		if (straightA.toLowerCase().compareTo(StraightB.toLowerCase())==0) {
			return true;
		}else {
			return false;
		}
		
	}

	private static String straight(String a) {
		// TODO Auto-generated method stub
		
		char[] chars = a.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		
		return sorted;
	}

}

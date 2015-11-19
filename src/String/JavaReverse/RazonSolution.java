package String.JavaReverse;

import java.util.Scanner;

public class RazonSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		String A,B = "";
		
		A = sc.next();
		
		for (int i = A.length()-1; i>=0; i--) {
			B= B+A.charAt(i);
		}
		
		if (A.compareTo(B)==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		

	}

}

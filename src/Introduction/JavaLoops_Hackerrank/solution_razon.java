package introduction;

import java.util.Scanner;

public class JavaLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,n,b,t;
		t = sc.nextInt();
		for (int i = 0; i <t; i++) {
			
			a = sc.nextInt();
			n = sc.nextInt();
			b = sc.nextInt();
			
			int sum = 0;
			
			for (int j = 0; j < n; j++) {
				
				for (int j2 = 0; j2 <=j; j2++) {
					sum +=b*Math.pow(2, j2); 
				}
				sum = sum +a;
				System.out.print(sum+" ");
				sum = 0;
				
			}
			System.out.println();
			
			
			
		}
		
		

	}

}

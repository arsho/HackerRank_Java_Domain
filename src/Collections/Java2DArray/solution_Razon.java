package Collections.Java2DArray;

import java.util.Arrays;
import java.util.Scanner;

public class solution_Razon {

	public static void main(String[] args) {
	
		System.out.println(" ");
		
		Scanner scanner = new Scanner(System.in);
		int twoD[][] = new int[6][6];
		
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD.length; j++) {
				twoD[i][j]=scanner.nextInt();
			}
		}
		
//		for (int i = 0; i < twoD.length; i++) {
//			for (int j = 0; j < twoD.length; j++) {
//				System.out.print(twoD[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int sum=0, c=0;
	//	int sum[]=null;
		int big = twoD[1][1]+twoD[0][1]+twoD[0][0]+twoD[0][2]+twoD[2][0]+twoD[2][1]+twoD[2][2];
		//System.out.println(big);
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				sum = twoD[i][j]+twoD[i-1][j]+twoD[i-1][j-1]+twoD[i-1][j+1]+twoD[i+1][j-1]+twoD[i+1][j]+twoD[i+1][j+1];
				//sum[c] = twoD[i][j]+twoD[i-1][j]+twoD[i-1][j-1]+twoD[i-1][j+1]+twoD[i+1][j-1]+twoD[i+1][j]+twoD[i+1][j+1];
				//c++;
				if (sum>=big) {
					big=sum;
				}
			}
		}
		
		//Arrays.sort(sum);
		//System.out.println(big);
		
		System.out.println(big);
		
		
	}
}

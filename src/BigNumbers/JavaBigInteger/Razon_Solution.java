package BigNumbers.JavaBigInteger;

import java.util.Scanner;

public class Razon_Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		
		java.math.BigInteger pBigInteger = new java.math.BigInteger(a);
		java.math.BigInteger qBigInteger = new java.math.BigInteger(b);

		System.out.println(pBigInteger.add(qBigInteger));
		System.out.println(pBigInteger.multiply(qBigInteger));

	}

}

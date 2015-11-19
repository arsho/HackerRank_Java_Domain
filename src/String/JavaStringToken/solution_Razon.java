package String.JavaStringToken;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class solution_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		 Scanner scan = new Scanner(System.in);
         String s=scan.nextLine();
        // int c=0;
         StringTokenizer stringTokenizer = new StringTokenizer(s,"!,?._'@");
         ArrayList<String>list = new ArrayList<String>();
         while (stringTokenizer.hasMoreTokens()) {
			
        	 list.add(stringTokenizer.nextToken());
			
		}
         System.out.println(list.size());
         for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
         

	}

}

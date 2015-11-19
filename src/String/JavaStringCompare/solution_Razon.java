package String.JavaStringCompare;

import java.util.Scanner;

public class solution_Razon {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		System.out.println(" ");
        Scanner sc=new Scanner( System.in );
        String A=sc.next();
        int len = sc.nextInt();
       
        // let us assume both small and large substrings are the very first ones
        String small = A.substring(0,len);
        String large = small;
       
        // now skim thru the string one substring at a time thru iteration
       // comparing it with both small and large and doing the replacement
        for (int i=1; i < A.length()-len+1 ; i++ ) {

            String current = A.substring(i,i+len);

            if ( current.compareTo(small) < 0 )
                small = current;
           
            if ( current.compareTo(large) > 0 )
                large = current;
        }
       
        System.out.println(small);
        System.out.println(large);
       
      
    }

	

}

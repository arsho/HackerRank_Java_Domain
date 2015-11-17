package string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class solution_Razon {

	/**
	 * @param args
	 */
	 public static void main(String[] args){
		 System.out.println("");
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	             //Write your code
	         testCases--;
	         try {
	             Pattern.compile(pattern);
	             System.out.println("Valid");
	         } catch (PatternSyntaxException exception) {
	             System.out.println("Invalid");
	            
	         }
	        
	        
	         
	      }
	   }

}

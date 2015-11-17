package string;

import java.util.Scanner;

public class JavaRegex {

	/**
	 * @param args
	 */
	 
	 class myRegex {

	 static final String pattern = 
				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	
	

}

	 
	 public static void main(String []args)
	    {
	        Scanner in = new Scanner(System.in);
	       
	        while(in.hasNext())
	        {
	            String IP = in.next();
	            System.out.println(IP.matches(new myRegex().pattern));
	        }

	    }

}

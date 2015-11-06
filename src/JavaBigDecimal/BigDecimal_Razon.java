package bigNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigDecimal_Razon {
	 public static void main(String []argh)
	    {
	        //Input
		 System.out.println(" ");
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++)
	        {
	            s[i]=sc.next();
	        }

	        //Write your code here
	        java.math.BigDecimal[] bigDecimals = {};
	       
	        for (int i = 0; i < s.length; i++) {
				bigDecimals[i] = new java.math.BigDecimal(s[i]);
			}
	        List<java.math.BigDecimal> lnums = Arrays.asList(bigDecimals);
	        Collections.sort(lnums);
//	      for (int i = 0; i < list.size(); i++) {
//				s[i] = list.get(i).toString();
//			}
//	      
	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(lnums.get(i));
	        }

	    }
}

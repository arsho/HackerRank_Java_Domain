package introduction;

import java.util.Scanner;

public class JavaIFElse {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();            
         String ans="";
         if(n%2==1)ans = "Weird";
         else
         {
            //Complete the code
             if((n%2==0 && (n>=2 && n<=5)) || n>20)ans = "Not Weird";
                 else if(n>=6 && n<=20)ans = "Weird";
             
         }
         System.out.println(ans);
         
     }

}

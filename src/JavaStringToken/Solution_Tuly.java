    package JavaStringToken;
	import java.io.*;
    import java.util.*;
    import java.util.StringTokenizer;

    public class Solution_Tuly {
      
        public static void main(String[] args) 
        {
      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
		  StringTokenizer stkn=new StringTokenizer(s," !,?._'@");
		  System.out.println(stkn.countTokens());
		  while(stkn.hasMoreTokens())
		  {
			  System.out.println(stkn.nextToken());
		  }
		

        }
    }

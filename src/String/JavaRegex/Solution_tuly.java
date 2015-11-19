package String.JavaRegex;
import java.util.*;
import java.util.regex.*;
public class Solution_tuly {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String p="^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
		Pattern pt=Pattern.compile(p);
		Matcher m=pt.matcher(s);
		if(m.find())
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}

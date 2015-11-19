package Introduction.JavaOutputFormatting;

import java.util.Scanner;

public class Solution_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            
            int size = s1.length();
            int f = 15-size;
            System.out.print(s1);
            for (int j = 0; j < f; j++) {
            	System.out.print(" ");
			}
            String string="0";
            String xString = x+"";
            if (xString.length()==2) {
				xString = string.concat(xString);
			}else if (xString.length()==1) {
				xString = string.concat(xString);
				xString = string.concat(xString);
			}
            System.out.println(xString);
            
        }
        System.out.println("================================");

}
}

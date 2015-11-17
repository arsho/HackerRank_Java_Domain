package JavaStringCompare;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_tuly {

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str1;
       int no,i;
       str1=sc.nextLine();
       no=sc.nextInt();
       String str2[]=new String[str1.length()-(no-1)];
       for(i=0;i<=str1.length()-no;i++)
       {
           str2[i]=str1.substring(i,i+no);
           //System.out.println(str2[i]);
       }
       Arrays.sort(str2);
       System.out.println(str2[0]);
       System.out.println(str2[i-1]);      
    }
}
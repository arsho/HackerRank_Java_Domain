//By Shelia Rahman Tuly
//Problem:Hackerrank Java Domain -Java ArrayList 
//Verdict:Accepted
package JavaArraylist;
import java.util.*;
import java.io.*;

public class Solution_Tuly {
	public static void main(String[]args){
		
		int d,x,y,i,line,no,qu,j;
		ArrayList<int[]> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		for(i=1;i<=line;i++)
		{
			d=sc.nextInt();
			int[] arr=new int[d+1];
			arr[0]=d;
			for(j=1;j<=d;j++)
			{
				arr[j]=sc.nextInt();
			}
			list.add(arr);		
	}
		
		qu=sc.nextInt();
		System.out.println(list.size());
		for(i=1;i<=qu;i++)
		{
			x=sc.nextInt();
			y=sc.nextInt();
			int[] arr2;
			arr2=list.get(x-1);
			System.out.println(arr2.length);
			if(x<=list.size() && y<arr2.length)
			{
				
				System.out.println(arr2[y]);
			}
			else
			{
				System.out.println("ERROR !");
			}
		}
	}

}
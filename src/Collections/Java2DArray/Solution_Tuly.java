//problem:Hackerrank java domain - java 2D array
//Verdict:Accepted
package Collections.Java2DArray;
import java.util.*;

public class Solution_Tuly {
	
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int [][] arr=new int[6][6];
	        int i,j,sum,k,max;
	        for(i=0;i<6;i++)
	            {
	            for(j=0;j<6;j++)
	                {
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        max=0;
	        for(i=0;i<4;i++)
	            {
	            for(j=0;j<4;j++)
	                {
	            	sum=0;
	                for(k=j;k<j+3;k++)
	                    {
	                    	sum+=(arr[i][k]+arr[i+2][k]);
	                    }
	                sum+=arr[i+1][j+1];
	                if(sum>=max)
	                {
	                	max=sum;
	                }
	                
	            }
	            
	        }
	        System.out.println(max);
	        sc.close();
	    }
	

}

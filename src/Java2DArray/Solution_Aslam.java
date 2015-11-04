package Java2DArray;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Solution by mdaslamhossin*/
public class Solution_Aslam {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
       
        // Declaration section
        
        int [][] array=new int[6][6];
        // Input section
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
                array[i][j]=scanner.nextInt();
            
        }
        int sum=0,hourGlass=-99;
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                sum=array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                if(sum>hourGlass)
                    hourGlass=sum;
            }
        }
        System.out.println(hourGlass);
        
    }
}
package JavaDataTypes;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void println(Object obj){
        System.out.println(obj);
    }
    
    public static void check(String num){
        byte b;
        short s;
        int i;
        long l;
        
        int b_check=0;
        int s_check=0;
        int i_check=0;
        int l_check=0;
        int all_check=0;
        
        
        try{
            b=Byte.parseByte(num);            
            b_check=1;
            all_check=1;
        }catch(Exception e){
            
        };
        try{
            s=Short.parseShort(num);            
            s_check=1;
            all_check=1;            
        }catch(Exception e){
            
        };
        try{
            i=Integer.parseInt(num);            
            i_check=1;
            all_check=1;            
        }catch(Exception e){
            
        };
        try{
            l=Long.parseLong(num);            
            l_check=1;
            all_check=1;            
        }catch(Exception e){
            
        };
        
        if(all_check==0){
            println(num+" can't be fitted anywhere.");
        }
        else{
            println(num+" can be fitted in:");
            if(b_check==1) println("* byte");
            if(s_check==1) println("* short");
            if(i_check==1) println("* int");
            if(l_check==1) println("* long");
            
        }
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,i;
        String num;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            num=sc.next();
            check(num);
        }    
        
    }
}
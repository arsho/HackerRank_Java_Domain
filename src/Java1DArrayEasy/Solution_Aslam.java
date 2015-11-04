package Java1DArrayEasy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Coded by Aslam
*/
public class Solution_Aslam {

    public static void main(String[] args) {
        /*Code starts*/
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,sum=0,res=0;
        n=sc.nextInt();
        int[] ar=new int[n];
        for(i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        res=0;
        for(i=0;i<n;i++){
            sum=0;
            for(j=i;j<n;j++){
                sum+=ar[j];
                if(sum<0){
                    res++;
                }
            }
        }
        println(res);
        /*Code ends*/
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

}
/*
5
1 -2 4 -5 1

*/

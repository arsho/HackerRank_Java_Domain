package JavaArraylist;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,q,x,y,i,j,k;
        n=sc.nextInt();
        ArrayList<ArrayList> main_ar=new ArrayList<ArrayList>();
        for(i=0;i<n;i++)
        {
            d=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for(j=0;j<d;j++){
                ar.add(sc.nextInt());
            }
            main_ar.add(ar);
        }
        q=sc.nextInt();
        for(i=0;i<q;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            try{
                ArrayList o=main_ar.get(x-1);
                int res=(int)o.get(y-1);
                System.out.println(res);
            }catch(Exception e){
                //e.printStackTrace();
                System.out.println("ERROR!");
            }
        }
    }
}
package Introduction.JavaStaticInitializerBlock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*Code starts*/

    static boolean flag;
    static int B, H;

    static {
        flag = true;
        String errorString = "java.lang.Exception: Breadth and height must be positive";
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println(errorString);
        }
    }

    /*Code ends*/
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

package JavaDataTypes;

import java.util.*;
import java.io.*;

public class Solution_Aslam {

    public static void main(String[] argh) {



        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                int a=(int)Math.pow(2,63);
                int b=a-1;
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                if (x >= -a && x <= b) 
                {
                     System.out.println("* long"); 
                }
                else
                {
                     System.out.println("* long"); 
                }
                
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}

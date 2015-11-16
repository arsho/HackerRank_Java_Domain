package Java2DArray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[6][6];
        int i, j, p, q, temp, sum, final_sum = -99999;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                sum = ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
                final_sum = Math.max(sum, final_sum);
            }
        }
        System.out.println(final_sum);
    }
}

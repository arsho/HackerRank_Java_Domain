
package JavaLoops_Hackerrank;

import java.util.Scanner;

public class Solution_Aslam 
{
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int loop = 1, result = 0, a, b, c, n;
        int step = sc.nextInt();
        while (loop <= step) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            result=a;
            for (int i = 0; i < n; i++) {                   
                result = (int) (Math.pow(2, i)*b + result);
                if (i == 0) {
                    System.out.printf("%d", result);
                } else {
                    System.out.printf(" %d", result);
                }
            }
            System.out.println("");
            loop++;
        }

    }
}

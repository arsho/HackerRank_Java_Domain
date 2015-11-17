package PatternSyntaxChecker;

/**
 * @author arsho
 * @problemName Pattern Syntax Checker
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/pattern-syntax-checker
 */
import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}

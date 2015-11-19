package String.JavaUsername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Razon_Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" ");
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();
            //String pattern = Complete this line in the editable area below  
            String pattern = "^[A-Za-z][A-Za-z0-9_]*{8,30}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }

}

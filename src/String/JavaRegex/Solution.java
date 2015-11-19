
package String.JavaRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class myRegex {
    public static String pattern="([0-1]?[0-9]?[0-9]|[0-2]?[0-5]?[0-5])\\.([0-1]?[0-9]?[0-9]|[0-2]?[0-5]?[0-5])\\.([0-1]?[0-9]?[0-9]|[0-2]?[0-5]?[0-5])\\.([0-1]?[0-9]?[0-9]|[0-2]?[0-5]?[0-5])";    
}
class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

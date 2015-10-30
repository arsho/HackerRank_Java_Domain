package JavaMap;

/*
Problem: Java Map
Link: https://www.hackerrank.com/challenges/phone-book
*/
import java.util.HashMap;
import java.util.Scanner;


public class JavaMap {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String,Integer> phone_book=new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phone_book.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            try{
                int ret=phone_book.get(s);
                System.out.println(s+"="+ret);                
            }
            catch(Exception e){
                System.out.println("Not found");
            }
        }
    }
}
/*
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
*/
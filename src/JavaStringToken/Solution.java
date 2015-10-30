package JavaStringToken;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        /*Code starts*/
        //!,?._'@
        s = s.trim();
        if (s.length() > 400000) {
            return;
        } else if (s.length() == 0) {
            println("0");
        } else {
            String delimeter = "[^a-zA-Z]+";
            String[] res = s.split(delimeter);
            println(res.length);
            for (String str : res) {
                println(str);
            }
        }

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
He is a very very good boy, isn't he?
*/

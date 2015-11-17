package JavaBigDecimal;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

class MyPair<K, V> {

    public final K key;
    public final V value;

    public MyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}

class Solution {

    public static void main(String[] argh) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        //Write your code here
        BigDecimal[] bd_ar = new BigDecimal[n];

        List<MyPair<String, BigDecimal>> hm_pair = new ArrayList<MyPair<String, BigDecimal>>();

        for (int i = 0; i < n; i++) {
            String current_string = s[i];
            BigDecimal tmp = new BigDecimal(current_string);
            bd_ar[i] = tmp;
            hm_pair.add(new MyPair(current_string, tmp));
        }

        Arrays.sort(bd_ar, Collections.reverseOrder());

        String[] final_ar = new String[n];

        for (int i = 0; i < n; i++) {
            BigDecimal current_number = bd_ar[i];
            for (MyPair m : hm_pair) {
                BigDecimal hm_current_number = (BigDecimal) m.value;
                String hm_current_string = m.key.toString();
                if (current_number.equals(hm_current_number)) {
                    final_ar[i] = hm_current_string;
                    hm_pair.remove(m);
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            s[i] = final_ar[i];
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
/*
 9
 -100
 50
 0
 56.6
 90
 0.12
 .12
 02.34
 000.000

 Critical Testcase:
 5
 0
 0
 0
 0
 0

 */

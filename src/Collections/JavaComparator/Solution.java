package JavaComparator;

import java.io.*;
import java.util.*;

/*Code starts*/
class Checker {

    Comparator<Player> desc = new Comparator<Player>() {

        @Override
        public int compare(Player o1, Player o2) {
            if (o2.score == o1.score) {
                return o2.name.compareTo(o1.name);
            }
            return o2.score - o1.score;
        }
    };
}
/*Code ends*/

class Player {

    String name;
    int score;
}

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player Player[] = new Player[N];
        Checker check = new Checker();
        for (int i = 0; i < N; i++) {
            s = br.readLine().trim();
            st = new StringTokenizer(s);
            Player[i] = new Player();
            Player[i].name = st.nextToken();
            Player[i].score = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player, check.desc);
        for (int i = 0; i < Player.length; i++) {
            System.out.printf("%s %s\n", Player[i].name, Player[i].score);
        }

    }
}

package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Checker {

	Comparator<Player> desc = new Comparator<Player>() {

		public int compare(Player arg0, Player arg1) {
			// TODO Auto-generated method stub
			if (arg0.score==arg1.score) {
				return arg1.name.compareTo(arg0.name);
			}
			return arg1.score-arg0.score;
		}

	};
}

class Player {
	String name;
	int score;
}

public class Comparator_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
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

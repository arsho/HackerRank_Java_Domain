package Collections.JavaComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class CheckerRazon {

	Comparator<PlayerRazon> desc = new Comparator<PlayerRazon>() {

		public int compare(PlayerRazon arg0, PlayerRazon arg1) {
			// TODO Auto-generated method stub
			if (arg0.score==arg1.score) {
				return arg1.name.compareTo(arg0.name);
			}
			return arg1.score-arg0.score;
		}

	};
}

class PlayerRazon {
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
		PlayerRazon PlayerRazon[] = new PlayerRazon[N];
		CheckerRazon check = new CheckerRazon();
		for (int i = 0; i < N; i++) {
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			PlayerRazon[i] = new PlayerRazon();
			PlayerRazon[i].name = st.nextToken();
			PlayerRazon[i].score = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(PlayerRazon, check.desc);
		for (int i = 0; i < PlayerRazon.length; i++) {
			System.out.printf("%s %s\n", PlayerRazon[i].name, PlayerRazon[i].score);
		}

	}

}

package Collections.JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] argh) {
		
		println(" ");
		
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			map.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			
			if (map.containsKey(s)) {
				println(s+"="+map.get(s));
			}else {
				println("Not found");
			}
			
		}
	}
	
	public static void print(Object object)
	{
		System.out.print(object);
	}
	public static void println(Object object)
	{
		System.out.println(object);
	}
	
	
}

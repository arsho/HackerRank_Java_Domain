package dataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


//class Item{
//	String first;
//	String second;
//}

public class HashSet_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println(" ");

		HashSet<String> hashSet = new HashSet<String>();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		//Item it[] = new Item[n];
		
		for (int i = 0; i < n; i++) {
			String name1 = in.nextLine();
//			String name2 = in.nextLine();
//			
//			it[i] = new Item();
//			it[i].first = name1;
//			it[i].second = name2;
//			
//			hashSet.add(it[i]);
//			
//			HashSet<Item> hashSet2 = new HashSet<Item>();
//			hashSet2 = hashSet;
			hashSet.add(name1);
			println(hashSet.size());
			
		}

	}

	public static void print(Object object) {
		System.out.print(object);
	}

	public static void println(Object object) {
		System.out.println(object);
	}
	

}

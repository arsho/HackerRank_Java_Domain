package dataStructure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Stack_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] argh) {
		println(" ");
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			Stack<Character> stack = new Stack<Character>();
			
			for (int i = 0; i < input.length(); i++) {
				
				char c = input.charAt(i);
				if (stack.empty()) {
					stack.push(c);
				}else {
					if (c==')' && stack.peek()=='(' || c=='}' && stack.peek()=='{' || c==']' && stack.peek()=='[' ) {
						stack.pop();
					}else {
						stack.push(c);
					}
				}
		
			}
			
			println(stack.isEmpty());
			
			
		}

	}

	public static void print(Object object) {
		System.out.print(object);
	}

	public static void println(Object object) {
		System.out.println(object);
	}

}

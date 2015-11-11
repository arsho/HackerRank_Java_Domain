package dataStructure;

import java.util.Stack;

public class StackMethods_Razon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stack works in LIFO order
		// Generally it is a vector along with 5 more mathods
		// here the top value is the value at last

		Stack<Object> stack = new Stack<Object>();

		// push() to store data on top
		stack.push(5);

		stack.push(8);

		stack.push(55);

		stack.push(89);
		println("After push " + stack);

		// pop() to get data from top
		stack.pop();
		println("After pop " + stack);

		// peek() to get top(longest distance from start) value
		println("Peek vlaue is "+stack.peek());
		// empty() return true if the stack is empty
		if (stack.empty()) {
			println("Empty");
		} else {
			println("Not Empty");
		}
		// search(Object O) returns the distance from top to O if O stays in the
		// stack
		println("Searching 5 " + stack.search(5));
		
		//it also contains the mothods of vectors as it is extends vector like add, addall, capacity, clearcopyInto , elementAt etc.

	}

	private static void println(Object string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}

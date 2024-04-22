package com.dsa;

import java.util.Stack;

public class StackDS {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(6);
		stack.push(10);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		stack.push(48);
		stack.push(64);
		stack.push(1044);
		System.out.println(stack.peek());
		System.out.println(stack.size());
	
	}

}

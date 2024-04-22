package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(13);
		queue.add(55);
		queue.add(99);
		queue.add(88);
		queue.add(47);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		System.out.println(queue.size());;
	}

}

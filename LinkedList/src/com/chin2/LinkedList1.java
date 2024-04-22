package com.chin2;

public class LinkedList1 {

	Node head;
	private int size;

	public LinkedList1() {
		size = 0;
	}

	class Node {

		String data;
		Node next;

		Node(String data) {

			this.data = data;
			this.next = null;
		}
	}

	// addFirst
	public void addFirst(String data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// addLast
	public void addLast(String data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;
	}

	public void printList() {
		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		head = this.head.next;
		size--;
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		size--;
		if (head.next == null) {
			head = null;
			return;
		}

		Node currNode = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			currNode = currNode.next;
			lastNode = lastNode.next;
		}

		currNode.next = null;
	}

	public int getSize() {
		return size;
	}

	// add middle
	public void addInMiddle(int index, String data) {
	       if(index > size || index < 0) {
	           System.out.println("Invalid Index value");
	           return;
	       }
	       size++;


	       Node newNode = new Node(data);
	       if(head == null || index == 0) {
	           newNode.next = head;
	           head = newNode;
	           return;
	       }
	        Node currNode = head;
	       for(int i=1; i<size; i++) {
	           if(i == index) {
	               Node nextNode = currNode.next;
	               currNode.next = newNode;
	               newNode.next = nextNode;
	               break;
	           }
	           currNode = currNode.next;
	       }
	   }

	
	public static void main(String[] args) {

		LinkedList1 ll = new LinkedList1();
		ll.addFirst("a");
		ll.addFirst("is");
		ll.addLast("list");
		ll.printList();

		ll.addFirst("this");
		ll.printList();
		System.out.println(ll.getSize());

		ll.removeFirst();
		ll.printList();

		ll.removeLast();
		ll.printList();
		
		//add middle
		ll.addFirst("Chintu");
	      ll.addFirst("name");
	      ll.addFirst("my");
	      System.out.println(ll);
	     
	      ll.addInMiddle(2, "is");
	      System.out.println(ll);

	}
}

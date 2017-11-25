package com.java.linkedlist;

public class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		public Node(int d) {
			this.data = d;
		}
	}

	/**
	 * insert at the beginning of the list
	 * 
	 * @param data
	 */
	public void insertFront(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;

		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void insertAfterGivenNode(Node prevNode, int data) {

		if (prevNode == null) {
			System.out.println("Given node is not exist in the list");
			return;
		}

		Node newNode = new Node(data);

		newNode.next = prevNode.next;
		prevNode.next = newNode;

	}

	public void insertAtTheEnd(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	/**
	 * Remove first occurrence of given key
	 */

	public void remove(int key) {

		Node temp = head;
		Node prev = null;

		// if head is the key
		if (temp != null && temp.data == key) {
			head = head.next;
			temp.next = null;
		}

		// Traverse list until key find or list ends

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// if key not found
		if (temp == null)
			return;

		prev.next = temp.next;
		temp.next = null;

	}

	/**
	 * Remove node at the given position
	 */

	public void removeAtPosition(int position) {

		if (head == null)
			return;

		Node temp = head;

		if (position == 0)
			head = temp.next;

		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}

		// Position is higher than list size
		if (temp == null)
			return;

		temp.next = temp.next.next;
	}

	/**
	 * Remove node at last
	 */
	public void removeAtLast() {

		if (head == null)
			return;

		if (head.next == null) {
			head = null;
		}

		Node temp = head;
		Node prev = null;

		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}

		prev.next = null;

	}

	/**
	 * Get Length of list
	 */

	public int getLength() {

		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	public int getLengthRecusrsive(Node node) {

		if (node == null) {
			return 0;
		}

		return 1 + getLengthRecusrsive(node.next);
	}
	
	public int getLengthRec() {
		
		return getLengthRecusrsive(head);
	}

	public void printList() {

		Node n = head;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}

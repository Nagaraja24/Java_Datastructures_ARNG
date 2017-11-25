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

	public void printList() {

		Node n = head;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String args[]) {

		LinkedList list = new LinkedList();

		java.util.LinkedList lst = new java.util.LinkedList<>();

		list.insertFront(5);
		list.insertFront(4);
		list.insertFront(3);
		System.out.println("List after inserting front:");
		list.printList();

		list.insertAfterGivenNode(list.head.next, 8);
		System.out.println("List after inserting at list->head->next ");
		list.printList();

		list.insertAtTheEnd(11);
		list.insertAtTheEnd(12);

		System.out.println("List after inserting last");
		list.printList();

	}

}

package com.java.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// java.util.LinkedList lst = new java.util.LinkedList<>();

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

		list.remove(12);
		System.out.println("List after removing the key : 12");
		list.printList();

		list.removeAtPosition(2);
		System.out.println("List after removing data at position: 2");
		list.printList();

		System.out.println("Length of list: " + list.getLength());
		// Empty list
		LinkedList list2 = new LinkedList();
		System.out.println("Length of list2: " + list2.getLength());

	}

}

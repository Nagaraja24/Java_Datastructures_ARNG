package com.java.linkedlist;

import com.java.linkedlist.LinkedList.Node;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// java.util.LinkedList lst = new java.util.LinkedList<>();

		list.insertFront(5);
		list.insertFront(4);
		list.insertFront(3);
		System.out.println("List after inserting front:");
		list.printList(list.head);

		list.insertAfterGivenNode(list.head.next, 8);
		System.out.println("List after inserting at list->head->next ");
		list.printList(list.head);

		list.insertAtTheEnd(11);
		list.insertAtTheEnd(12);
		System.out.println("List after inserting last");
		list.printList(list.head);

		list.remove(12);
		System.out.println("List after removing the key : 12");
		list.printList(list.head);

		list.removeAtPosition(2);
		System.out.println("List after removing data at position: 2");
		list.printList(list.head);

		System.out.println("Length of list: " + list.getLength());
		// Empty list
		LinkedList list2 = new LinkedList();
		System.out.println("Length of list2: " + list2.getLength());
		System.out.println("***********************Serach Element ***********************");
		System.out.println(list.searchElementIterative(11));
		
		System.out.println(list.searchElementRecursive(list.head, 4));
		
		System.out.println("*******************Swap*****************************");
		list.swapNode(3, 11);
		
		System.out.println("**********************Reverse List********************");
		/*Node node = list.reverseLinkedList(list.head);
		list.printList(node);*/
		
		System.out.println("Before reverse");
		list.printList(list.head);
		
		Node reversed = list.reverseLinkedListRecursively(null, list.head);
		
		System.out.println("After reverse");
		list.printList(reversed);
		
		System.out.println("******************************Find Loop*************************");
		//list.head.next.next.next = list.head;
		System.out.println("Is loop found: "+list.findLoopInLinkedList());
		
		//list.head.next.next.next = list.head;
		System.out.println("********************Remove duplicates from Sorted List****************************");
		list.insertAtTheEnd(11);
		list.insertFront(3);
		System.out.println("Before Removing duplicates");
		list.printList(list.head);
		
		list.removeDuplicateFromSortedList(list.head);
		System.out.println("After Removing duplicates");
		list.printList(list.head);
	}

}

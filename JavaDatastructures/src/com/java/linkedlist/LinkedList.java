package com.java.linkedlist;

import java.awt.Cursor;
import java.util.Currency;
import java.util.HashSet;

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
	 * Search Iterative Approach
	 * 
	 * @param x
	 * @return
	 */
	public boolean searchElementIterative(int x) {
		Node current = head;
		while (current != null) {
			if (current.data == x) {
				return true;
			}
			current = current.next;

		}
		return false;

	}

	/**
	 * Search Recursive approach
	 * 
	 * @param head
	 * @param x
	 * @return
	 */
	public boolean searchElementRecursive(Node head, int x) {

		Node current = head;

		if (current == null)
			return false;

		if (current.data == x)
			return true;

		return searchElementRecursive(current.next, x);

	}

	/**
	 * Swap nodes without swapping data --> assuming data is distinct
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public void swapNode(int x, int y) {

		if (x == y)
			return;

		Node prevX = null, currentX = head;
		while (currentX != null && currentX.data != x) {
			prevX = currentX;
			currentX = currentX.next;
		}

		Node prevY = null, currentY = head;
		while (currentY != null && currentY.data != y) {
			prevY = currentY;
			currentY = currentY.next;
		}

		if (currentX == null || currentY == null)
			return;

		if (prevX != null) {
			prevX.next = currentY;
		} else
			head = currentY;

		if (prevY != null) {
			prevY.next = currentX;
		} else
			head = currentX;

		Node temp = currentX.next;
		currentX.next = currentY.next;
		currentY.next = temp;
		
		printList(head);

	}
	
	public void swapTwoNodes(int x, int y) {

		if (x == y)
			return;

		Node prevX = null;
		Node currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		Node prevY = null;
		Node curry = head;
		while (currX != null && currX.data != y) {
			prevY = curry;
			curry = curry.next;
		}

		if (prevX != null) {
			prevX.next = curry;
		} else
			head = curry;

		if (prevY != null) {
			prevY.next = currX;
		} else {
			head = currX;
		}

	}
	

	/**
	 * Reverse Linked List -- Iterative method
	 * 
	 * @param node
	 * @return
	 */
	Node reverseLinkedList(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		
			while(current!= null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			
			node = prev;
		
		return node;
	}
	
	/**
	 * Reverse list recursively
	 * 
	 * @param previous
	 * @param current
	 * @return
	 */
	public Node reverseLinkedListRecursively(Node previous, Node current) {
		
		if(current.next == null) {
			current.next = previous;
			head = current;
			return null;
		}
		
		Node nextCurrent = current.next;
		current.next = previous;
		previous = current;
		
		reverseLinkedListRecursively(current, nextCurrent);
		
		return head;
	}
	
	/**
	 * Remove duplicates from sorted linked list
	 * @param head
	 * @return
	 */
	public Node removeDuplicateFromSortedList(Node head) {
		
		Node current = head;
		Node next_next;

		while (current.next != null) {

			if (current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			} else {
				current = current.next;
			}
		}
		
		return head;
	}
	
	
	/**
	 * Find the loop in the Linked List using slow and fast pointer(The Tortoise and the Hare Algorithm)
	 * @return
	 */
	public boolean findLoopInLinkedList() {
	        Node slow_p = head, fast_p = head;
	        while (slow_p != null && fast_p != null && fast_p.next != null) {
	            slow_p = slow_p.next;
	            fast_p = fast_p.next.next;
	            if (slow_p == fast_p) {
	                System.out.println("Found loop");
	                return true;
	            }
	        }
	        return false;
	    }
	
	/**
	 * Find loop in linked list using hashtable
	 * @param head
	 * @return
	 */
	public boolean findLoopInLinkedListUsingHashTable(Node head) {
		
		HashSet<Node> nodeSet = new HashSet<>();
		
		Node temp = head;
		
		while(temp!=null) {
			if(nodeSet.contains(temp))
				return true;
			
			nodeSet.add(temp);
			
			temp = temp.next;
		}
		return false;
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

	public void printList(Node node) {

		Node n = node;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}

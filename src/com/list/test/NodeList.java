package com.list.test;

import java.util.Arrays;

import com.list.stack.Node;
import com.stack.ExceptionStackEmpty;

/**
 * 
 * @author gannyee
 *
 */
public class NodeList {

	// Declared head node
	private static Node head;
	// Declared rear node
	private static Node rear;
	// Get size
	private static int size;

	// Constructor
	public NodeList() {
		head = rear = null;
		size = 0;
	}

	// Add node after a requested node
	public void AddElementAfterNode(Object desElement, Object newElement) {
		Node traNode = head;
		Node copyNode;
		Node newNode = new Node(newElement, null);
		// Find element's position
		if (FindElement(desElement)) {
			while (traNode != null) {
				if (traNode.getElement() == desElement)
					break;
				traNode = traNode.getNext();
			}
			newNode.setNext(traNode.getNext());
			traNode.setNext(newNode);
			size++;
			System.out.println(newElement
					+ " Successfully added in the after of " + desElement);
		} else {
			System.out.println("Element: " + desElement
					+ " isn't in node list, can't be added");
		}

	}

	// Add node by first node
	public void AddElementByFirst(Object element) {

		Node newNode = new Node(element, head);
		if (size == 0 && rear == null)
			rear = newNode; // Let the rear node not be a null node
		head = newNode;
		System.out.println(element
				+ " Successfully added in the head of node list!");
		size++;
	}

	// Add node by last node
	public void AddElementByLast(Object element) {
		Node newNode = new Node(element, null);
		if (isEmpty()) {
			head = newNode;
			rear = newNode;
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
		System.out.println(element
				+ " Successfully added in the rear of node list!");
		size++;
	}

	// Delete node by first node
	public void DeleteElementByFirst() throws ExceptionNodeListEmpty {
		Object copyElement;
		if (isEmpty())
			throw new ExceptionNodeListEmpty("Node list is empry!");
		copyElement = head.getElement();
		head = head.getNext();
		System.out.println(copyElement
				+ " Successfully deleted from the head of node list!");
		size--;
	}

	// Delete node by last node
	public void DeleteElementByLast() throws ExceptionNodeListEmpty {
		Object copyElement;
		if (isEmpty())
			throw new ExceptionNodeListEmpty("Node list is empry!");
		Node travelNode = head;
		while (travelNode != null) {
			if (travelNode.getNext() == rear) {
				break;
			}
			travelNode = travelNode.getNext();
		}
		copyElement = rear.getElement();
		rear = travelNode;
		rear.setNext(null);
		System.out.println(copyElement
				+ " Successfully deleted from the rear of node list!");
		size--;
	}

	// Delete node which in center of node list
	public void DeleteNodeInCenter(Object element) {

		Node traNode = head;
		Node swapNode;
		// Find element's position
		if (FindElement(element)) {
			while (traNode != null) {
				if (traNode.getNext().getElement() == element)
					break;
				traNode = traNode.getNext();
			}
			traNode.setNext(traNode.getNext().getNext());
			System.out.println("Delete node in the center of node list!");
		} else {
			System.out.println("Element: " + element
					+ " isn't in node list, can't be deleted");
		}

	}

	// Find node
	private boolean FindElement(Object element) {
		int flag = 0; // Element not found
		Node travelNode = new Node(element, null);
		travelNode = head;
		while (travelNode != null) {

			if (travelNode.getElement() == element) {
				return true;
			}
			travelNode = travelNode.getNext();
		}
		return false;
	}

	// Modify element of node in node list
	public void ModifyElement(Object oldElement, Object newElememt) {
		Node traNode = head;
		// Find element's position
		if (FindElement(oldElement)) {
			while (traNode != null) {
				if (traNode.getElement() == oldElement)
					break;
				traNode = traNode.getNext();
			}
			oldElement = traNode.getElement();
			traNode.setElement(newElememt);
			System.out.println("Successfully modify! before: " + oldElement
					+ " After: " + traNode.getElement());
		} else {
			System.out.println("Element: " + oldElement
					+ " isn't in node list, can't be modified");
		}
	}

	// Whether node list is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Is Element in node list
	public void isInNodeList(Object element) {
		if (FindElement(element))
			System.out.println("Element: " + element + " is in node list");
		else
			System.out.println("Element: " + element + " isn't in node list");
	}

	// Get the size of stack
	public int getSize() {
		if (isEmpty())
			return 0;
		else
			return size;
	}

	// Get the all elements of stack
	public void getAllElements() throws ExceptionStackEmpty {
		Node travelTop;
		String allElement = "";
		travelTop = head;
		for (int i = 0; travelTop != null; i++) {
			String str = travelTop.getElement().toString();
			allElement = allElement + str + "  ";
			travelTop = travelTop.getNext();
		}
		System.out.println("Get all elemnt: " + allElement);
	}
}

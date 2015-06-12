package com.list.test;

/**
 * Setup Node class 
 * @author gannyee
 *
 */
public class Node {
	//Declared element
	private Object element;
	//Declared next node
	private Node next;
	
	//Constructor of Class Node
	public Node(){
		this(null,null);
	}

	public Node(Object newElement,Node newnNext){
		element = newElement;
		next = newnNext;
	}
	//Get element function
	public Object getElement() {
		return element;
	}

	//Set element function
	public void setElement(Object newElement) {
		element = newElement;
	}

	//Get next node function
	public Node getNext() {
		return next;
	}

	//Set next node function
	public void setNext(Node newNext) {
		next = newNext;
	}
}

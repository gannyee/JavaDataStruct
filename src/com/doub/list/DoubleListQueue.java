package com.doub.list;

import java.util.Arrays;

import com.queue.ExceptionQueueEmpty;

public class DoubleListQueue {

	// Declared head
	private static DoubleNode head;
	// Declared rear
	private static DoubleNode rear;
	// Declared size;
	private static int size;
	//Declared length
	private static int length;
	// Constructor
	public DoubleListQueue() {
		//initialize  
		head = new DoubleNode();
		rear = new DoubleNode();
		
		head.setNext(rear);
		head.setPrior(null);
		rear.setNext(null);
		rear.setPrior(head);
		this.size = this.length = 0;
	}

	// Get size
	public int getSize() {
		return size;
	}
	
	//Get length
	public int length(){
		return length;
	}
	
	// Is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Insert element in first position
	public void insertFirst(Object element) {
		DoubleNode newNode = new DoubleNode(head,element,head.getNext());
		head.getNext().setPrior(newNode);
		head.setNext(newNode);
		size ++;
		length = size;
	}

	// Insert element in last position
	public void insertLast(Object element) {
		DoubleNode newNode = new DoubleNode(rear.getPrior(),element,rear);
		rear.getPrior().setNext(newNode);
		rear.setPrior(newNode);
		size ++;
		length = size;
	}

	// Remove element from first position
	public void removeFirst() throws ExceptionQueueEmpty{
		if(isEmpty())
			throw new ExceptionQueueEmpty("Queue is empty");
		head.getNext().getNext().setPrior(head);
		head.setNext(head.getNext().getNext());
		size --;
	}

	// Remove element from last position
	public void removeLast() throws ExceptionQueueEmpty{
		if(isEmpty())
			throw new ExceptionQueueEmpty("Queue is empty");
		rear.getPrior().getPrior().setNext(rear);
		rear.setPrior(rear.getPrior().getPrior());
		size --;
	}

	// Get first node but not isn't deletion
	public Object getFirst() throws ExceptionQueueEmpty{
		if(isEmpty())
			throw new ExceptionQueueEmpty("Queue is empty");
		return head.getNext().getElement();
	}

	// Get last node but not isn't deletion
	public Object getLast() throws ExceptionQueueEmpty{
		if(isEmpty())
			throw new ExceptionQueueEmpty("Queue is empty");
		return rear.getPrior().getElement();
	}
	
	//Get all element
	public void getAllElements(){
		Object[] array = new Object[getSize()];
		
		DoubleNode travelNode = new DoubleNode();
		travelNode = head.getNext();
		for(int i = 0; travelNode != rear;i ++){
			array[i] = travelNode.getElement();
			travelNode = travelNode.getNext();
		}
		System.out.println("All elements are: " + Arrays.toString(array));
	}
}

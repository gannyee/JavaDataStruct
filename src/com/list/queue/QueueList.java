package com.list.queue;
import java.util.Arrays;

import com.list.stack.Node;
import com.list.stack.ExceptionStackEmpty;

/**
 * 
 * @author gannyee
 *
 */
public class QueueList {
	
	//Declared head node
	private static Node head = new Node();
	//Declared rear node
	private static Node rear = new Node();
	//Declared size
	private static int size;
	//queue list
	private static int length;
	//Constructor initialize head, rear, size
	public QueueList(){
		head = rear = null;
		size = length = 0;
	}
	
	//Get size
	public int getSize(){
		return size;
	}
	
	//Get length
		public int length(){
			return length;
		}
	
	//Is empty
	public boolean isEmpty(){
		return size == 0;
	}
	
	//Enqueue element
	public void enqueue(Object element){
		Node newNode = new Node(element,head);
		if(getSize() == 0){
			head = newNode;
			rear = newNode;
		}
		head = newNode;
		size ++;
		length = size;
	}
	
	//Dequeue element
	public Object dequeue() throws ExceptionStackEmpty{
		if(isEmpty())
			throw new ExceptionStackEmpty("Queue is empty!");
		Node travelNode = new Node();
		travelNode = head;
		Object elementRear;
		while(travelNode != null){
			if(travelNode.getNext() == rear)
				break;
			travelNode = travelNode.getNext();
		}
		elementRear = rear.getElement();
		rear = travelNode;
		size --;
		return elementRear;
	}
	
	//Get head node but not delete
	public Object getHeadNode() throws ExceptionStackEmpty{
		if(isEmpty())
			throw new ExceptionStackEmpty("Queue is empty!");
		return head.getElement();
	}
	
	//Travel all node of queue
	public void getAllElement(){
		Node travelTop;
		travelTop = head;
		Object[] array = new Object[getSize()];
		
		for(int i = 0;i < array.length;i ++ ){
			array[i] = travelTop.getElement();
			travelTop = travelTop.getNext();
		}
		System.out.println("Get all elemnt: " + Arrays.toString(array));
	}
	
}

package com.list.stack;

import java.util.Arrays;

import com.stack.ExceptionStackEmpty;
import com.list.stack.Node;

public class StackList {

	//Declared size of stack list
	private static int size;
	//Declared element 
	private static Node top;
	public StackList() {
		this.size = 0;
		this.top = null;
	}

	// Get the size of stack
	public int getSize() {
		if(isEmpty())
			return 0;
		else
			return size;
	}

	// Get whether stack is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// Get the top element of stack
	public Object top() throws ExceptionStackEmpty {
		if(isEmpty())
			throw new ExceptionStackEmpty("Stack is empty!");
		return top.getElement();
	}

	// Push element to stack
	public void push(Object element){
		Node newNode = new Node(element,top);
		top = newNode;
		size ++;
	}

	// Pop element from stack
	public Object pop() throws ExceptionStackEmpty {
		if(isEmpty())
			throw new ExceptionStackEmpty("Stack is empty!");
		Object container = top.getElement();
		top = top.getNext();
		size --;
		return container;
	}

	// Get the all elements of stack
	public void getAllElements() throws ExceptionStackEmpty {
		Node travelTop;
		travelTop = top;
		Object[] array = new Object[getSize()];
		
		for(int i = 0;i < array.length;i ++ ){
			array[i] = travelTop.getElement();
			travelTop = travelTop.getNext();
		}
		System.out.println("Get all elemnt: " + Arrays.toString(array));
	}
}

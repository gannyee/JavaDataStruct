package com.stack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author gannyee
 *
 */
public class Stack {
	//Define capacity constant:CAPACITY
	private static final int CAPACITY = 1024;
	//Define capacity
	private static int capacity;
	//Define the top position of stack 
	//top = -1 meaning that the stack empty
	private static int top = -1;
	//Basic Object class array
	Object[] array;
	//Initialize the capacity of stack
	public Stack() {
		this.capacity = CAPACITY;
		array = new Object[capacity];
		top = -1;
	}
	
	//Get the size of stack
	public int getSize(){
		if(isEmpty()){
			return 0;
		}else{
			return top + 1;
		}
	}
	
	//Get whether stack is empty
	public boolean isEmpty(){
		return (top < 0);
	}
	
	//Get the top element of stack
	public Object top() throws ExceptionStackEmpty{
		
		if(isEmpty()){
			throw new ExceptionStackEmpty("Stack is empty");
		}
		return array[top];
		
	}
	
	//Push element to stack
	public void push(Object element) throws ExceptionStackFull{
		   if(getSize()== CAPACITY){
			   throw new ExceptionStackFull("Stack is full");
		   }
		   array[++ top] = element;
	}
	
	//Pop element from stack
	public Object pop() throws ExceptionStackEmpty{
		if(isEmpty()){
			throw new ExceptionStackEmpty("Stack is empty");
		}
		return array[top --];
	}
	
	//Get the all elements of stack
	public String getAllElements() throws ExceptionStackEmpty{
		int[] arr = new int[top + 1];
		if(!isEmpty()){
			for(int i = 0;i < getSize();i ++){
				arr[i] = (Integer)array[i];
			}
		}
		return Arrays.toString(arr);
	}
}

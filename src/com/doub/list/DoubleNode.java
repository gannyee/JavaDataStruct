package com.doub.list;

/**
 * 
 * @author gannyee
 *
 */
public class DoubleNode {
	
	//Declared element
	private Object element;
	//Declared prior
	private DoubleNode prior;
	//Declared next
	private DoubleNode next;
	
	//Constructor 
	public DoubleNode(){
		this(null,null,null);
	}
	
	public DoubleNode(DoubleNode prior,Object element, DoubleNode next){
		this.prior = prior;
		this.element = element;
		this.next = next;
	}
	//Get element
	public Object getElement() {
		return element;
	}

	//Set element
	public void setElement(Object element) {
		this.element = element;
	}

	//Get prior
	public DoubleNode getPrior() {
		return prior;
	}
	
	//Set prior
	public void setPrior(DoubleNode prior) {
		this.prior = prior;
	}

	//Get next
	public DoubleNode getNext() {
		return next;
	}
	
	//Set next
	public void setNext(DoubleNode next) {
		this.next = next;
	}
	
}

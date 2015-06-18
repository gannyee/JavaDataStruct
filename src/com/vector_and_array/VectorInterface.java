/**
 * Vector Interface
 */
package com.vector_and_array;

/**
 * @author gannyee
 *
 */
public interface VectorInterface {
	
	//Get size of vector
	public int getSize();
	
	//Is empty
	public boolean isEmpty();
	
	//Get element at rank
	public Object getAtRank(int position) throws ExceptionBoundaryExceed;
	
	//Replace element at rank
	public void replaceAtRank(int position,Object element) throws ExceptionBoundaryExceed;
	
	//Insert element at rank
	public void insertAtRank(int position,Object element) throws ExceptionBoundaryExceed;
	
	//Remove element at rank
	public void removeAtRank(int position) throws ExceptionBoundaryExceed;
	
	//Travel all elements
	public void getAllelements();
}

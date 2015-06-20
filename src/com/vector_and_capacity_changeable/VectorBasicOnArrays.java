package com.vector_and_capacity_changeable;

import java.util.Arrays;

public class VectorBasicOnArrays implements VectorInterface {
	//Define static variable
	private static int CAPACITY = 8;
	//Declared size of vector
	private static int size;
	//Declared array for vector
	Object[] array;
	
	//Constructor
	public VectorBasicOnArrays(){
		size = 0;
		array = new Object[CAPACITY];
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object getAtRank(int position) throws ExceptionBoundaryExceed{
		if(position < 0 || position > size)
			throw new ExceptionBoundaryExceed("Vector exceed! ");
		return array[position];
	}

	@Override
	public void replaceAtRank(int position, Object element) throws ExceptionBoundaryExceed{
		if(position < 0 || position > size)
			throw new ExceptionBoundaryExceed("Vector exceed! ");
		array[position] = element;
		System.out.println("Element replaced is: " + array[position] + " at position: " + position);
	}

	@Override
	public void insertAtRank(int position, Object element) throws ExceptionBoundaryExceed{
		if(position < 0 || position > size)
			throw new ExceptionBoundaryExceed("Vector exceed! ");
		if(position >= CAPACITY){//Deal with overflow
			CAPACITY *= 2;
			Object[] arrayNew = new Object[CAPACITY];
			
			for(int i = 0;i < array.length;i ++)
				arrayNew[i] = array[i];
			array = arrayNew;
		}
		for(int i = size;i > position;i --)
			array[i] = array[i - 1];
		array[position] = element;
		size ++;
		System.out.println("Element you insert is: " + element + " at position: " + position);
	}

	@Override
	public void removeAtRank(int position) throws ExceptionBoundaryExceed{
		if(position < 0 || position > size)
			throw new ExceptionBoundaryExceed("Vector exceed! ");
		System.out.println("Element you remove is: " + array[position]);
		for(int i = position;i < size - 1;i ++)
			array[i] = array[i + 1];
		size --;
	}

	@Override
	public void getAllelements() {
		Object[] arrayTravel = new Object[size];
		
		for(int i = 0;i < arrayTravel.length;i ++)
			arrayTravel[i] = array[i];
		System.out.println("All elements are: " + Arrays.toString(arrayTravel));
	}
	
	
}

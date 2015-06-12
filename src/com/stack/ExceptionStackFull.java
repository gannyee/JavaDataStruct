package com.stack;

public class ExceptionStackFull extends Exception {
	
	//Constructor
		public ExceptionStackFull(){
			
		}
		
		//Define myself exception construct with parameters
		public ExceptionStackFull(String string){
			super(string);
		}
}

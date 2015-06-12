package com.stack;

public class MatchClass {

	public static boolean Match(String str) throws ExceptionStackFull, ExceptionStackEmpty{
		Stack stack = new Stack();
		str = str.replaceAll(" ","");
		char s;
		for(int i = 0;i < str.length();i ++){
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
				stack.push(str.charAt(i));
			else{
				if(stack.isEmpty())
					return false;
				else{
					s = str.charAt(i);
					switch(s){
					case ')':
						if((Character)stack.pop() != '(')
							return false;
						break;
					case '}':
						if((Character)stack.pop() != '{')
							return false;
						break;
					case ']':
						if((Character)stack.pop() != '[')
							return false;
						break;
					}
				}
				
			}
		}
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}

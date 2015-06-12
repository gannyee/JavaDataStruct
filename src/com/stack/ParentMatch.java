package com.stack;

public class ParentMatch {

	public static void main(String[] args) {
		
		MatchClass match = new MatchClass();
		String str0 = "()({})";  //Match
		String str1 = "()({}) {([()[]])}";//Match
		String str2 = "([]{)";//Not match
		String str3 = ")([()] {}";//Not match
		String str4 = "([())]{}";//Not match
		try {
			if(!match.Match(str0)){
				System.out.println(str0 + ": Not Macth");
			}else{
				System.out.println(str0 + ": Macth");
			}
			if(!match.Match(str1)){
				System.out.println(str1 + ": Not Macth");
			}else{
				System.out.println(str1 + ": Macth");
			}
			if(!match.Match(str2)){
				System.out.println(str2 + ": Not Macth");
			}else{
				System.out.println(str2 + ": Macth");
			}
			if(!match.Match(str3)){
				System.out.println(str3 + ": Not Macth");
			}else{
				System.out.println(str3 + ": Macth");
			}
			if(!match.Match(str4)){
				System.out.println(str4 + ": Not Macth");
			}else{
				System.out.println(str4 + ": Macth");
			}
		} catch (ExceptionStackFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptionStackEmpty e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

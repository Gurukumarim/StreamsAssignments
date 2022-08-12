package com.training.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class FunDemo {

	public static void main(String[] args) {

		
		
		  String str="java is fun";
		  
		  char[] ch=new char[str.length()];
		  
		  for(int i=0;i<str.length();i++)
		  {
			  ch[i]=str.charAt(i);
		  
		  } for(char c:ch) { System.out.print(" "+c); }
		 
		 
			
			/*
			 * String str="java is fun"; String []arrOfStr=str.split(":");
			 * 
			 * for(String val:arrOfStr) { System.out.println(" "+val); }
			 */
	}

}

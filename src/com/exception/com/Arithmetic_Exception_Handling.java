package com.exception.com;

public class Arithmetic_Exception_Handling {
	
	public static void main(String[] args) {
		
		System.out.println("Arithmetic Exception Handling");
		 
		int a = 10;
		int b=0;
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e1) {
			
			//e1.printStackTrace();
			System.out.println(e1);
		}
		
		int d = 10;
		
		int e = d+a;
		System.out.println("After exception running successfully:"+e);
		
		
	}

}

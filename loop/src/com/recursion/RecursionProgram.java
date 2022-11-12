package com.recursion;

public class RecursionProgram {

	public static void main(String[] args) {
		
		RecursionProgram rep=new RecursionProgram();
		
		System.out.println(rep.factorial(5));
	}

	private int factorial(int no) {
			if(no==1) {
				return 1;
			}
			else {
				return no*factorial(no-1);
			}
				
	}

}

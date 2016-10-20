package com.main;

public class Factorial {
	public int factWithOutRec(int num){

	       int result=1;
	       for (int i = 1; i <= num; i++) {
	           result = result * i;
	       }
	     //  System.out.println("The factorial of given number " + result);
	       return result;
	       
	   }
	

}

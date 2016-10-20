package com.test;

import com.main.Factorial;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

import java.util.Scanner;


public class FactorialTest {
	
	int num;
	@BeforeMethod
	public void getInt(){
	
		System.out.println("Enter the factorial Number::");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
	    
	}

	@Test()
	public void method1(){
		//int num=3;
		Factorial fact=new Factorial();
		int expected=6;
		int actual=fact.factWithOutRec(num);
	assertEquals(expected, actual);
		
	
	}
	
	@Test
	public void method2(){
	//int num=4;
		Factorial fact=new Factorial();
		int expected=24;
		int actual=fact.factWithOutRec(num);
		assertEquals(expected, actual);
	
	}
	
	@Test()
	public void method3(){
		//int num=0;
		Factorial fact=new Factorial();
		int expected=1;
		int actual=fact.factWithOutRec(num);
		assertEquals(expected, actual);
	
	}
	
	@Test(expectedExceptions=NullPointerException.class)
	public void method4(){
		//int num= (Integer) null;
		Factorial fact=new Factorial();
		int expected=0;
		int actual=fact.factWithOutRec(num);
		assertEquals(expected, actual);
	
	}


	
}
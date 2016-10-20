package com.test;
import com.main.Factorial;
import com.main.ReverseString;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

import java.util.Scanner;



public class ReverseStringTest {
	String str;
	@BeforeMethod
	public void getInt(){
	
		System.out.println("Enter the String::");
		Scanner sc= new Scanner(System.in);
		str=sc.next();
	    
	}
	@Test
	public void method1(){
		//String str="anshu";
		ReverseString rev=new ReverseString();
		String actual=rev.revStr(str);
		assertEquals("uhsna",actual);
			
	}
	
	@Test
	public void method2(){
		//String str="ab";
		ReverseString rev=new ReverseString();
		String expected="ba";
		String actual=rev.revStr(str);
		assertEquals(expected,actual);
			
	}
	
	@Test
	public void method3(){
		//int num= (Integer) null;
		ReverseString rev=new ReverseString();
		String expected="llob!!";
		String actual=rev.revStr(str);
		assertEquals(expected,actual);
	
	}
	@Test(expectedExceptions=NullPointerException.class)
	public void method4(){
		//int num= (Integer) null;
		ReverseString rev=new ReverseString();
		String expected="";
		String actual=rev.revStr(str);
		assertEquals(expected,actual);
	}

	@AfterMethod
	public void clearInt(){
		System.out.println("After method");
		str= null;
	}
	

}

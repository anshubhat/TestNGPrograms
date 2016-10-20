package com.main;

public class ReverseString {


	public String revStr(String str){
		
	//StringBuffer sbuf = new StringBuffer();
		String reverse="";
			
			for (int i=0; i<str.length(); i++){
				System.out.print(str.charAt(i));
			}
		System.out.println("enter name::" + str);
		System.out.println("");
		   for(int j = str.length() - 1; j >= 0; j--)
		 {
			   reverse = reverse + str.charAt(j);
		}
		   System.out.println(reverse);
		   return reverse;

		}

		}
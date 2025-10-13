package com.example.demo;

public class Identity {

	public static void main(String[] args) {
		String str1 = new String("is same?");
		String str2 = new String("is same?");
		
//		동일성
		System.out.println(str1 == str2);
		
		
		System.out.println("===============");
		
//		동등성
		System.out.println(str1.equals(str2)); // true or false?
	}

}

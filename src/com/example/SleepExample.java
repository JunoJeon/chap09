package com.example;

import java.sql.SQLException;

public class SleepExample {
	
	/*
	 * Error
	 * 1. Compiler Error(문법에러)
	 * 2. 실행시에 발생하는 에러(Exception)
	 * 
	 * Exception
	 * 1. Compiler Checked Exception   (Exception)
	 * 2. Compiler UnChecked Exception (RuntimeException)
	 * 
	 */
	
	public static void main(String[] args) {
		String str = null;
		
		System.out.println(str.toUpperCase());
		
		NullPointerException x = new NullPointerException();
	}
	
	public static void main3(String[] args) {
		int num = 100;
		int result = num / 0;	// UnChecked Exception
		
		System.out.println("result = " + result);
	}

	public static void main2(String[] args) {
		
		System.out.println("10초 후에 종료 됩니다.");
		
		InterruptedException x;
		
//		Thread.sleep(10000);
		
		SQLException s;
		
//		DriberManger.getConnection(" ");
		
		System.out.println("종료됨");

	}

}

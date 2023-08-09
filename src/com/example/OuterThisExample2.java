package com.example;

public class OuterThisExample2 {
	int num = 100;
	
	class A {
		int num = 200;
		
		void xxx() {
			int num = 300;
			System.out.println("num = "+num);
			System.out.println("num = "+ this.num);
			System.out.println("num = "+ OuterThisExample2.this.num);
		}
	}
	public static void main(String[] args) {
		
		
	}
}

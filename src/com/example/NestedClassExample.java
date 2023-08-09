package com.example;

class Alpha {
	
}

public class NestedClassExample { //퍼블릭 클래스틑 하나만들어간다
	
	int n1;		// 인스턴스 필드, 힙
	static int n2; //	메소드 영역 (Code영역)
	
	class A { 	// 인스턴스 멤버 클래스
		
	}
	
	static class B { // 정적(static) 멤버 클래스
		
		
	}

	public static void main(String[] args) {
		
		int n3;		//로컬변수, 스택변수, 자동변수, 임시변수
		n2 = 200;
		
		NestedClassExample x = new NestedClassExample();
		x.n1 = 100;
		
		class C {	// 로컬 클래스
			
			
		}
		

	}

}

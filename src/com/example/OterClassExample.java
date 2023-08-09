package com.example;

public class OterClassExample {
	class A {			// 인스턴스 멤버 클래스
		int n1;
		static int n2;
	}
	static class B {	// 정적 멤버 클래스
		
	}

	public static void main(String[] args) {
		OterClassExample o = new OterClassExample();
		A a = o.new A();	// 클래스A는 인스턴스라 스태틱에선 일반적으로 쓸 수 없다.
		B b = new B();
		
		
		class C {		// 로컬 클래스
			
		}
		
		C c = new C();
		
	}

}

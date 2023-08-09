package com.example;

interface Movable {
	void left();
	void righr();
}

public class NestedInterfaceExample {
	
	interface Showable {		//무조건 정적
		void show();
		void hide();
	}

	public static void main(String[] args) {
		interface Localable {
			void xxx();
		}

	}

}

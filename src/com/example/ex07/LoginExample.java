package com.example.ex07;

public class LoginExample {

	public static void main(String[] args) {
		
		try {
			login("hong", "1234");		
		} catch(NotExistIDException e) {
			System.out.println(e.getMessage());
		} catch (WorngPasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	static void login(String id, String password) throws NotExistIDException, WorngPasswordException {
		
		if (!id.equals("blue"))
			throw new NotExistIDException("ID가 존재하지 않습니다.");
		
		
		if (!password.equals("12345"))
			throw new WorngPasswordException("패스워드가 틀립니다.");
			
		
		
		
	}
	
	

}

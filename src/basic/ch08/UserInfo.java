package basic.ch08;

public class UserInfo {
	
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	// 생성자 오버로딩 이란?
	// 생성자의 개수가 여러개 있다.
	
	// 기본 생성자 형태 만들어 보기 (return, void 타입 있으면 안된다.)
	public UserInfo() { }
	
	public UserInfo(String id) {
		userId = id;
	}
	
	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}
	
	// 연습문제 - 생성자를 만들 수 있는 방법
	// 1번 문제 - 매개변수 3개를 받는 생성자를 만들어 주세요.
	// 2번 문제 - 매개변수 4개를 받는 생성자를 만들어 주세요.
	// 3번 문제 - 매개변수 5개를 받는 생성자를 만들어 주세요.
	
	public UserInfo(String id, String name, String Password) {
		userId = id;
		userName = name;
		userPassword = Password;
	}
	
	public UserInfo(String id, String name, String Password, String Address) {
		userId = id;
		userName = name;
		userPassword = Password;
		userAddress = Address;
	}
	
	public UserInfo(String id, String name, String Password, String Address, String PhoneNumber) {
		userId = id;
		userName = name;
		userPassword = Password;
		userAddress = Address;
		phoneNumber = PhoneNumber;
	}
} // end of class

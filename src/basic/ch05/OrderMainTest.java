package basic.ch05;

public class OrderMainTest {
	// 코드의 시작
	public static void main(String[] args) {
		
		User user1 = new User(); // User 클래스의 인스턴스 변수명 : user1
		Order order1 = new Order(); // Order 클래스의 인스턴스 변수명 : order1
		
		user1.name = "홍길동";
		user1.age = 26;
		user1.gender = "남자";
		user1.phoneNumber = "010-0000-0000"; 
		
		order1.Menu = "에이드";
		order1.name = "자몽";
		order1.price = 7000;
		
		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.gender);
		System.out.println(user1.phoneNumber);
		
		System.out.println("---------------------");
		
		System.out.println(order1.Menu);
		System.out.println(order1.name);
		System.out.println(order1.price);
		
	} // end of main

} // end of class

package basic.ch11;

public class Person {

	// this의 3가지 사용방법
	// 1. this는 자기 자신을 가리킨다 (인스턴스의 주소)
	// 2. 생성자에 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. (중요) 자신의 주소(참조값, 주소값)를 반환 시킬 수 있다.

	// 변수 --> private
	private String name;
	private int age;
	private String phone;
	private String gender;

	// 1.
	// 생성자
	public Person(String name, int age) {
		// 자기 자신의 멤버 변수 name 외부에서 들어오는 지역 변수 name을 대입한다.
		// this.멤버변수 = 지역변수
		this.name = name;
		// this.멤버변수 = 지역변수
		this.age = age;
	} // end of Person()

	//
	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출할 수 있다. this(...)
		this(name, age); // 매개변수 2개 위에 있는 생성자 호출
		this.phone = phone;
		// 다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야 한다.

//		this.name = name;
//		this.age = age;
	} // end of Person()

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone); // 매개변수 3개 위에 있는 생성자 호출
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
		this.gender = gender;
	} // end of Person()

	// 3. 자신의 주소값을 반환 시킬 수 있다.
	
	// getter
	public Person getPerson() {
		// 자신에 주소값을 반환 시킨다.
		return this;
	} // end of getPerson();
	
	// getter
	public Person getAge() {
		return this;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	// setter
	public void setName(String name) {
		this.name = name;
	} 
	// setter
	public void setAge(int age) {
		this.age = age;
	}
	
	// setter
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 

}

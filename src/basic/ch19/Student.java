package basic.ch19;

public class Student {
	// 멤버 변수
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	} // 생성자
	
	public String getName() {
		return name;
	} // getter
	
	public int getAge() {
		return age;
	}// getter
	
	public void setName(String name) {
		this.name = name;
	} // setter
	
	public void setAge(int age) {
		this.age = age;
	} // setter

} // end of class

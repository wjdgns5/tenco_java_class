package basic.ch12;

public class Company {
	// 공통으로 참조하고 싶다. (static)
	// 어디든지 접근하게 한다 (public)
	public static String companyName = "그린컴퍼니";
	static int empSerialNumber = 1000;
	
	// 코드 테스트
	public static void main(String[] args) {
		Employee employee1 = new Employee("홍길동");
		System.out.println(employee1.getEmployeeId());
		
		Employee employee2 = new Employee("이순신");
		System.out.println(employee1.getEmployeeId());
		
		Employee employee3 = new Employee("이순신");
		System.out.println(employee1.getEmployeeId());
	}
	
}
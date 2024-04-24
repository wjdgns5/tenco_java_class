package basic.ch19;

public class Classroom {
	
	private String ClassName;
	private Student[] students; // 멤버변수 에는 배열을 지정하지 않아도 된다.
	private int studentCount;
	private final int MAX_STUDENT = 30;
	
	public Classroom(String className) {
		this.ClassName = className;
		students = new Student[MAX_STUDENT]; // student 객체 X, stduent 배열 O
		this.studentCount= 0; // 0 으로 초기화
	}// 생성자
	
	// 학생을 추가하는 기능 만들기
	public void addStudent(Student student) {
		if(studentCount < MAX_STUDENT) {
			students[0] = student;
			studentCount++; // 후위 연산자
			
		} else {
			System.out.println("정원 초과");
			
		}
	} // end of addStudent()
	
	// 학습에 속한 모든 학생 정보를 출력하는 기능을 만드시오.
	public void showStudents() {
		
		for(int i=0; i<students.length; i++) {
			// 방어적 코드 작성
			if(students[i] != null) { // students 배열 값에 null 값이 아니면 출력해라
				// student[i] ---> [객체주소] ---> heap 영역 객체를 참조
				System.out.println("name : " + students[i].getName()+ " , age : " + students[i].getAge());
			}
		}
	} // end of showStudents()
	
} // end of class

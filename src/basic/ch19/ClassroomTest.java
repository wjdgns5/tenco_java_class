package basic.ch19;

public class ClassroomTest {

	public static void main(String[] args) {
		
		Classroom classroomA = new Classroom("C4"); // Classroom 인스턴스 생성
		Student student1 = new Student("홍길동", 20); // Student 인스턴스 생성
		Student student2 = new Student("이순신", 24); // Student 인스턴스 생성
		
		classroomA.addStudent(student1); // Classroom의 addStudent(Student) 메서드 실행
		// classroomA.showStudents(); // 학습에 속한 모든 학생 정보를 출력
		
		classroomA.addStudent(student2); // Classroom의 addStudent(Student) 메서드 실행
		// classroomA.showStudents(); // 학습에 속한 모든 학생 정보를 출력
		
		classroomA.showStudents();
	} // end of main

} // end of class

package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {
	// Code Start
	public static void main(String[] args) {

		// 설계된 클래스(Bus, Student, Subway)를 가지고
		// 본인이 의도한 대로 실행에 흐름을 만들어 보자.

		// 스캐너를 활용해서
		// 사용자가 1번을 누르면 버스를 태워서 실행의 흐름을 만들고
		// 사용자가 2번을 누르면 지하철을 태우는 실행의 흐름을 만들어 보자.

		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);

		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);

		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 100_000);

		Scanner sc = new Scanner(System.in);

		System.out.println("1번 버스 2번 지하철");
		int a = sc.nextInt();

		if (a == 1) {
			s1.takeBus(bus1);
			bus1.showInfo();
			
		} else if (a == 2) {
			s1.takeSubway(subway1);
			subway1.showInfo();
}
		System.out.println();
		s1.showInfo();
	

	} // end of main

} // end of class

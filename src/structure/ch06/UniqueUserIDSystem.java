package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<>();
	} // 생성자

	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 True 반환
	// 중복 발생하면 false 반환
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	} // end of registerUserID()

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 - 흐름 만들기 --> while() , if() 문
		// 결과 - 정상 유저 등록 or 이미 등록된 사용자 입니다.(아이디가 존재합니다.)

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("아이디 입력 해주세요");
			String ID = sc.next();

			boolean isRegistered = registerUserID(ID);
			if (isRegistered) {
				System.out.println("새로운 ID 등록 " + ID);
			} else {
				System.out.println("중복 ID");
			}

		} // end of if()

	} // end of run()

	// 코드 테스트
	public static void main(String[] args) {

		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();

	} // end of main

} // end of class

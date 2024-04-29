package basic.exercise.interfaces;

public class UserInfoClient {
	// main (메인 쓰래드 : 메인 작업자 )
	public static void main(String[] args) {
		
		// 사용자에게 정보를 입력하세요 --> Scanner 활용
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		
		// DTO : 데이터들을 받아서(취합해서, 가공) 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		
		// 데이터를 받아서 IUserInfoDao를 구현한 구현 클래스 에게 전달하고자 한다.
		// UserInfoMySqlDaoImpl, UserInfoMySqlDaoImpl
		// IUserInfoDao iUserInfoDao1 = new UserInfoMySqlDaoImpl();
		IUserInfoDao iUserInfoDao1 = new UserInfoOracleDaoImpl();
		
		iUserInfoDao1.insertUserInfo(userInfo);
		iUserInfoDao1.updateUserInfo(userInfo);
		iUserInfoDao1.deleteUserInfo(userInfo.getId());
		iUserInfoDao1.selectUserInfo();
	
	} // end of main

} // end of class

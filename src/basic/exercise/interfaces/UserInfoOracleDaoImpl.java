package basic.exercise.interfaces;

public class UserInfoOracleDaoImpl implements IUserInfoDao {
	// Alt + Shift + R 

	@Override
	public void insertUserInfo(UserInfo info) {
		System.out.println("오라클 DB 에 유저 생성");
	}

	@Override
	public void updateUserInfo(UserInfo info) {
		System.out.println("오라클 DB 에 유저 수정 ");
	}

	@Override
	public void deleteUserInfo(int id) {
		System.out.println("오라클 DB 에 유저 삭제");
	}

	@Override
	public void selectUserInfo() {
		System.out.println("오라클 DB 에 유저 조회");
	}	

}

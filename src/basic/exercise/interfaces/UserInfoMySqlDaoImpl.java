package basic.exercise.interfaces;

public class UserInfoMySqlDaoImpl implements IUserInfoDao {

	// 1. public 앞에 abstract 사용 하던가
	// 2. IUserInfoDao @Override 하던가

	@Override
	public void insertUserInfo(UserInfo info) {
		// SQL : 질의어 - 배웠다면 -- MySQL 언어를 활용해서 구현
		System.out.println("insert into user_tb valus(info.getUserName())");
	}

	@Override
	public void updateUserInfo(UserInfo info) {
		System.out.println("update set user_tb name = info.getUserName()");
	}

	@Override
	public void deleteUserInfo(int id) {
		System.out.println("delete from user_tb where id = info.getId()");
	}

	@Override
	public void selectUserInfo() {
		System.out.println("select * from user_tb");
	}
}

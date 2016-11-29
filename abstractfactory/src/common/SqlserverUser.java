package common;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 22:50
 */
public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SQL Server中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在SQL Server中根据id得到User表一条记录");
		return null;
	}
}

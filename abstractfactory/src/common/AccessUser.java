package common;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 22:53
 */
public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在Access表中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在Access中根据id得到User表一条记录");
		return null;
	}
}

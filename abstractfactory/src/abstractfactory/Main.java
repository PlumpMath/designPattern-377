package abstractfactory;

import common.IUser;
import common.User;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:04
 */
public class Main {

	public static void main(String[] args) {

		User user = new User();

		SqlServerFactory factory = new SqlServerFactory();

		IUser iu = factory.createUser();

		iu.insert(user);
		iu.getUser(1);
	}
}

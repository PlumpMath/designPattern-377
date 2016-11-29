package reflect;

import common.Department;
import common.IDepartment;
import common.IUser;
import common.User;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:27
 */
public class Main {

	public static void main(String[] args) {

		User user = new User();
		Department dept = new Department();

		IUser iu = DataAccess.createUser();

		iu.insert(user);
		iu.getUser(1);

		IDepartment id = DataAccess.createDepartment();

		id.insert(dept);
		id.getDepartment(1);
	}
}

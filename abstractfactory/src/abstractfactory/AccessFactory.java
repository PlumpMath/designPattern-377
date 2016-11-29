package abstractfactory;

import common.AccessDepartment;
import common.AccessUser;
import common.IDepartment;
import common.IUser;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:02
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}
}

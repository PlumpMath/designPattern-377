package abstractfactory;

import common.IDepartment;
import common.IUser;
import common.SqlserverDepartment;
import common.SqlserverUser;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:01
 */
public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlserverDepartment();
	}
}

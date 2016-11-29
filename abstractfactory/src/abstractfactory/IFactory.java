package abstractfactory;

import common.IDepartment;
import common.IUser;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 22:54
 */
public interface IFactory {

	public IUser createUser();
	public IDepartment createDepartment();
}

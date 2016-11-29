package common;

import common.Department;
import common.IDepartment;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:11
 */
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在Access中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在Access中根据id得到Department表一条记录");
		return null;
	}
}

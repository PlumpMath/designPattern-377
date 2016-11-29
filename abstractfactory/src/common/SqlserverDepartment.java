package common;

import common.Department;
import common.IDepartment;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:08
 */
public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在SQL Server中给Department表增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在SQL Server中根据id得到Department表一条记录");
		return null;
	}
}

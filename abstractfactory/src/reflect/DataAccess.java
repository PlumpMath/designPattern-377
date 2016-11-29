package reflect;

import common.IDepartment;
import common.IUser;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:21
 */
public class DataAccess {

	private static final String packageName = "common";
	private static final String db = "Sqlserver";
	//private static final String db = "Access";

	public static IUser createUser() {
		try {

			String className = packageName + "." + db + "User";
			Class<?> user = Class.forName(className);

			return (IUser) user.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static IDepartment createDepartment() {
		try {

			String className = packageName + "." + db + "Department";
			Class<?> user = Class.forName(className);

			return (IDepartment) user.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

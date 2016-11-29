package simplefactory;

import common.*;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 23:15
 */
public class DataAccess {

	private static final String db = "SqlServer";
	//private static final String db = "Access";

	public static IUser createUser() {

		IUser result = null;

		switch (db) {
			case "SqlServer":
				result = new SqlserverUser();
				break;
			case "Access":
				result = new AccessUser();
				break;
		}

		return result;
	}

	public static IDepartment createDepartment() {

		IDepartment result = null;

		switch (db) {
			case "SqlServer":
				result = new SqlserverDepartment();
				break;
			case "Access":
				result = new AccessDepartment();
				break;
		}

		return result;
	}
}

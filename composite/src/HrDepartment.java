import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 16:41
 */
public class HrDepartment extends Company {

	public HrDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {

		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}

	@Override
	public void lineOfDuty() {

		System.out.println(name + " 员工招聘培训管理");
	}
}

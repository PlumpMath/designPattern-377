/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 16:41
 */
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
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

		System.out.println(name + " 公司财务收支管理");
	}
}

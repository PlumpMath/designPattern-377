/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 16:54
 */
public class NationalDebt {

	private String name;

	public NationalDebt(String name) {
		this.name = name;
	}

	public void sell() {
		System.out.println("国债： " + name + " 卖出");
	}
	public void buy() {
		System.out.println("国债： " + name + " 买入");
	}
}

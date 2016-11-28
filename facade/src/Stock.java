/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 16:51
 */
public class Stock {

	private String name;

	public Stock(String name) {
		this.name = name;
	}

	public void sell() {
		System.out.println("股票： " + name + " 卖出");
	}
	public void buy() {
		System.out.println("股票： " + name + " 买入");
	}
}

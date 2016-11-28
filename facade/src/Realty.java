/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 16:54
 */
public class Realty {

	private String name;

	public Realty(String name) {
		this.name = name;
	}

	public void sell() {
		System.out.println("房地产： " + name + " 卖出");
	}
	public void buy() {
		System.out.println("房地产： " + name + " 买入");
	}
}

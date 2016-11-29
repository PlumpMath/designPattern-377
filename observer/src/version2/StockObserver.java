package version2;


/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:55
 */
public class StockObserver {

	private String name;
	private Subject sub;

	public StockObserver(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}

	public void update() {

		System.out.println(sub.getSubjectState() + "" + name + "关闭股票行情，继续工作！");
	}
}

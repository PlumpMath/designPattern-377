package version1;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:55
 */
public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {

		System.out.println(sub.getSubjectState() + "" + name + "关闭股票行情，继续工作！");
	}
}

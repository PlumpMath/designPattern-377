package version2;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 16:25
 * java版委托
 */
public class Main {

	public static void main(String[] args) {

		// 老板胡汉三
		Subject huhansan = new BossSubject();

		// 看股票的同事
		final StockObserver tongshi1 = new StockObserver("魏关姹", huhansan);
		// 看NBA的同事
		final NbaObserver tongshi2 = new NbaObserver("易管查", huhansan);

		// 注册事件1
		huhansan.addEvent(new EventHandler() {
			@Override
			public void handle() {
				tongshi1.update();
			}
		});
		// 注册事件2
		huhansan.addEvent(new EventHandler() {
			@Override
			public void handle() {
				tongshi2.update();
			}
		});

		huhansan.setSubjectState("我胡汉三回来了！");

		huhansan.notice();
	}
}

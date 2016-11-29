package version1;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 15:12
 */
public class Main {

	public static void main(String[] args) {

		// 创建主题
		BossSubject huhansan = new BossSubject();

		// 观察者
		Observer tongshi1 = new StockObserver("魏关姹", huhansan);
		Observer tongshi2 = new NbaObserver("易管查", huhansan);

		// 注册到主题
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		// 更新主题内容
		huhansan.setSubjectState("我胡汉三回来了！");

		// 发出通知
		huhansan.notice();
	}
}

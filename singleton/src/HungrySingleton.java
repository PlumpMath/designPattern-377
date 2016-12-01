/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 23:05
 * 饿汉单例模式，多线程下也安全
 */
public class HungrySingleton {

	private HungrySingleton() {}

	private static HungrySingleton instance = new HungrySingleton();

	public static HungrySingleton getInstance() {

		return instance;
	}
}

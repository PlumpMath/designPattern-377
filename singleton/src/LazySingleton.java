/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 23:05
 * 多线程下不安全版的懒汉单例模式
 */
public class LazySingleton {

	private LazySingleton() {}

	private static LazySingleton instance;

	public static LazySingleton getInstance() {

		if(null == instance) {
			instance = new LazySingleton();
		}
		return instance;
	}
}

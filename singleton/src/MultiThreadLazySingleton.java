/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 23:05
 * 多线程下安全的懒汉单例模式，但会影响性能
 */
public class MultiThreadLazySingleton {

	private MultiThreadLazySingleton() {}

	private static MultiThreadLazySingleton instance;

	// 此方法增加synchronized，所以每次访问时都同步，会影响性能
	public static synchronized MultiThreadLazySingleton getInstance() {

		if(null == instance) {
			instance = new MultiThreadLazySingleton();
		}
		return instance;
	}
}

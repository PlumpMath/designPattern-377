/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 23:05
 * 多线程下安全的懒汉单例模式，双重锁定
 */
public class DoubleCheckLazySingleton {

	private DoubleCheckLazySingleton() {}

	private static DoubleCheckLazySingleton instance;

	//private static ReentrantLock lock = new ReentrantLock();	// 可以使用lock方式代替sychronized

	public static DoubleCheckLazySingleton getInstance() {

		// 先判断实例是否存在，不存在再同步或加锁处理
		if(null == instance) {

			// 如果实例为null，则进入同步块中的方法
			synchronized (DoubleCheckLazySingleton.class) {

				// 此时，虽然多个线程不能同时进入同步快，但是可能会有多个线程同时进入上一个null的判断，
				// 然后多个线程等待进入同步块，当有线程进入同步块时，可能已经被上一个线程实例化了，所以需要再判断一次
				if(null == instance) {
					instance = new DoubleCheckLazySingleton();
				}
			}
		}
		return instance;
	}
}

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 23:05
 * 更好的一种实现方式：静态内部类方式，多线程下安全，不会像同步/锁方式一样影响性能
 */
public class BetterSingleton {

	private BetterSingleton() {}

	public static BetterSingleton getInstance() {
		return Holder.INSTANCE;
	}

	private static class Holder {
		// 只有在被调用时才会初始化
		private static final BetterSingleton INSTANCE = new BetterSingleton();
	}
}

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 0:09
 * 手机品牌类
 */
public abstract class HandsetBrand {

	protected  HandsetSoft soft;

	/**
	 * 设置手机软件
	 * @param soft
	 */
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft = soft;
	}

	/**
	 * 运行
	 */
	public abstract void run();
}

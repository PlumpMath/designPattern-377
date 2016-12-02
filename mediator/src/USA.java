/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 17:26
 * 美国
 */
public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
	}

	/**
	 * 声明
	 * @param message
	 */
	public void declare(String message) {
		mediator.declare(message, this);
	}

	/**
	 * 获得消息
	 * @param message
	 */
	public void getMessage(String message) {
		System.out.println("美国获得对方信息：" + message);
	}
}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 0:49
 * 服务员类
 */
public class Waiter {

	private List<Command> orders = new ArrayList<Command>();

	/**
	 * 设置订单
	 * @param command
	 */
	public void setOrder(Command command) {

		if(命令模式.BAKE_CHICKEN_WING.equals(command.toString())) {
			System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
		} else {
			orders.add(command);
			System.out.println("增加订单：" + command.toString() + " 时间：" + new Date());
		}
	}

	/**
	 * 取消订单
	 * @param command
	 */
	public void cancelOrder(Command command) {

		orders.remove(command);
		System.out.println("取消订单：" + command.toString() + " 时间：" + new Date());
	}

	/**
	 * 通知全部执行
	 */
	public void notice() {

		for (Command cmd : orders) {

			cmd.excuteCommand();
		}
	}
}

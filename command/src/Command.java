/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 0:46
 * 抽象命令类
 */
public abstract class Command {

	protected  Barbecuer receiver;

	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}

	/**
	 * 执行命令
	 */
	public abstract void excuteCommand();
}

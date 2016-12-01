/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 0:47
 * 烤鸡翅命令
 */
public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

	@Override
	public String toString() {
		return 命令模式.BAKE_CHICKEN_WING;
	}
}

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 0:47
 * 烤羊肉串命令
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeMutton();
	}

	@Override
	public String toString() {
		return 命令模式.BAKE_MUTTON;
	}
}

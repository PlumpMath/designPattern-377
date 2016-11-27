package operation;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 22:35
 */
public class AddFactory implements IFactory {

	@Override
	public Operator createOperator() {
		return new AddOperator();
	}
}

package operation;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 22:36
 */
public class MinusFactory implements IFactory {

	@Override
	public Operator createOperator() {
		return new MinusOperator();
	}
}

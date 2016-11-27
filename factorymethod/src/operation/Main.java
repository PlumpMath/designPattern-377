package operation;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 22:37
 */
public class Main {

	public static void main(String[] args) {

		AddFactory addFactory = new AddFactory();
		Operator addOperator = addFactory.createOperator();

		double result = addOperator.calculate(1.0, 1.0);
		System.out.println("1.0 + 1.0 = " + result);
	}
}


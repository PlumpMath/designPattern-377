package operation;

/**
 * Created by Administrator on 2016/11/25.
 */
public class AddOperator implements Operator {

	@Override
	public double calculate(double operA, double operB) {

		return operA + operB;
	}
}

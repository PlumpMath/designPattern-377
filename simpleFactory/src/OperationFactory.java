/**
 * Created by Administrator on 2016/11/25.
 */
public class OperationFactory {

	public static Operator create(String operator) {

		if(null == operator) {
			throw new NullPointerException("param: operator can not be null.");
		}

		switch (operator) {
			case "+" :
				return new AddOperator();
			case "-" :
				return new MinusOperator();
			default:
				return null;
		}
	}
}

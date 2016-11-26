/**
 * Created by Administrator on 2016/11/26.
 */
public class Main {
	public static void main(String[] args) {

		String type = "return";
		CashContext cc = new CashContext(type);
		double result = cc.getResult(301.0);
		System.out.println("result: " + result);
	}
}

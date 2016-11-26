/**
 * Created by Administrator on 2016/11/26.
 */
public class CashContext {

	private ICash cash = null;

	public CashContext(String type) {

		switch (type) {

			case "normal":
				cash = new CashNormal();
				break;
			case "rebate":
				cash = new CashRebate(0.8);
				break;
			case "return":
				cash = new CashReturn(300.0, 100.0);
				break;
			default:
				throw new IllegalArgumentException("wrong type");
		}
	}

	public double getResult(double money) {

		return cash.acceptCash(money);
	}
}

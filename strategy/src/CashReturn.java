/**
 * Created by Administrator on 2016/11/26.
 */
public class CashReturn implements ICash {

	private double conditionMoney;
	private double returnMoney;

	public CashReturn(double conditionMoney, double returnMoney) {

		if(0.0 == conditionMoney || 0.0 == returnMoney) {
			throw new IllegalArgumentException("conditionMoney or returnMoney can not be 0.0");
		}
		this.conditionMoney = conditionMoney;
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {
		if(money >= conditionMoney) {
			return money - returnMoney;
		}
		return money;
	}
}

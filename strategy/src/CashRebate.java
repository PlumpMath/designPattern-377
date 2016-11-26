/**
 * Created by Administrator on 2016/11/26.
 */
public class CashRebate implements ICash {

	private double rebate = 0.0;

	public CashRebate(double rebate) {
		if(rebate == 0.0) {
			throw new IllegalArgumentException("rebate can not be 0.0.");
		}
		this.rebate = rebate;
	}

	@Override
	public double acceptCash(double money) {
		return money * rebate;
	}
}

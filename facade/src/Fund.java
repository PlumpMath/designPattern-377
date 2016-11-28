/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 16:56
 */
public class Fund {

	private Stock s1;
	private Stock s2;
	private NationalDebt nd1;
	private Realty r1;

	public Fund() {
		this.s1 = new Stock("1");
		this.s2 = new Stock("2");
		this.nd1 = new NationalDebt("1");
		this.r1 = new Realty("1");
	}

	/**
	 * 购买基金
	 */
	public void buyFund() {
		s1.buy();
		s2.buy();
		nd1.buy();
		r1.buy();
	}

	/**
	 * 赎回基金
	 */
	public void sellFund() {
		s1.sell();
		s2.sell();
		nd1.sell();
		r1.sell();
	}
}

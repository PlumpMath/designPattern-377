/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:42
 * 成功
 */
public class Success implements Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + this.getClass().getName()
				+ "时，背后多半有一个伟大的女人。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + this.getClass().getName()
				+ "时，背后大多有一个不成功的男人。");
	}
}

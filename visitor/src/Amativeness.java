/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:42
 * 恋爱
 */
public class Amativeness implements Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + this.getClass().getName()
				+ "时，凡事不懂也要装懂。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + this.getClass().getName()
				+ "时，遇事懂也装作不懂。");
	}
}

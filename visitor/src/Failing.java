/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:42
 * 失败
 */
public class Failing implements Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + this.getClass().getName()
				+ "时，闷头喝酒，谁也不用劝。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + this.getClass().getName()
				+ "时，眼泪汪汪，谁也劝不了。");
	}
}

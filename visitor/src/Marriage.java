/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:57
 * 结婚
 */
public class Marriage implements Action {

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + this.getClass().getName()
				+ "时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期。");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + this.getClass().getName()
				+ "时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。");
	}
}

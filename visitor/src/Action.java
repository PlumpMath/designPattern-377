/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:35
 * 状态
 */
public interface Action {

	/**
	 * 得到男人结论或反应
	 * @param concreteElementA
	 */
	public void getManConclusion(Man concreteElementA);

	/**
	 * 得到女人结论或反应
	 * @param concreteElementB
	 */
	public void getWomanConclusion(Woman concreteElementB);
}

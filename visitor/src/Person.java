/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:38
 * 人
 */
public interface Person {

	/**
	 * 接受
	 * @param visitor
	 */
	public void accept(Action visitor);
}

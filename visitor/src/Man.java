/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:37
 * 男人
 */
public class Man implements Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}
}

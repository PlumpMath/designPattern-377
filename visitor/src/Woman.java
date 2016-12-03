/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:39
 * 女人
 */
public class Woman implements Person {

	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}
}

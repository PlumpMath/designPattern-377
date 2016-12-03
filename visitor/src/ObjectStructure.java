import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 16:51
 * 对象结构
 */
public class ObjectStructure {

	private List<Person> elements = new ArrayList<Person>();

	/**
	 * 增加
	 * @param element
	 */
	public void attach(Person element) {
		elements.add(element);
	}

	/**
	 * 移除
	 * @param element
	 */
	public void detach(Person element) {
		elements.remove(element);
	}

	/**
	 * 查看显示
	 * @param visitor
	 */
	public void display(Action visitor) {

		for (Person e : elements) {
			e.accept(visitor);
		}
	}
}

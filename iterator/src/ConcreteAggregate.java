import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:07
 * 具体聚集类
 */
public class ConcreteAggregate implements Aggregate {

	private List<Object> items = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {

		return new ConcreteIterator(this);
		//return new ConcreteIteratorDesc(this);
	}

	/**
	 * 返回聚集总个数
	 * @return
	 */
	public int getCount() {
		return items.size();
	}

	/**
	 * 索引器，根据坐标获取元素
	 * @param index 坐标
	 * @return 元素
	 */
	public Object getThis(int index) {
		return items.get(index);
	}

	/**
	 * 根据坐标设置元素
	 * @param index 坐标
	 * @param item 元素
	 */
	public void setThis(int index, Object item) {
		items.add(index, item);
	}
}

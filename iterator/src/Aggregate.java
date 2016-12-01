/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:04
 * Aggregate聚集接口
 */
public interface Aggregate {

	/**
	 * 创建迭代器
	 * @return
	 */
	public Iterator createIterator();
}

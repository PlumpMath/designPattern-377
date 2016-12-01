/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:28
 * 更简版的迭代器接口
 * <br>
 * 使用方式：
 * while(iterator2.hasNext()) {
 *     Object item = iterator2.next();
 *     ...
 * }
 */
public interface Iterator2 {

	/**
	 * 判断是否还有下一个元素
	 * @return 有返回true，否则返回false
	 */
	public boolean hasNext();

	/**
	 * 获取下一个元素
	 * @return 下一个元素
	 */
	public Object next();
}

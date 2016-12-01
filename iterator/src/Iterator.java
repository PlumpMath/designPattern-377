/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:02
 * 迭代器接口
 */
public interface Iterator {

	public Object first();
	public Object next();
	public boolean isDone();
	public Object currentItem();
}

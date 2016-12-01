/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 18:17
 */
public class Main {

	public static void main(String[] args) {

		ConcreteAggregate a = new ConcreteAggregate();

		a.setThis(0, "大鸟");
		a.setThis(1, "小菜");
		a.setThis(2, "行李");
		a.setThis(3, "老外");
		a.setThis(4, "公交内部员工");
		a.setThis(5, "小偷");

		Iterator i = new ConcreteIterator(a);

		Object item = i.first();
		while(!i.isDone()) {
			System.out.println(i.currentItem() + "请买车票");
			i.next();
		}
	}
}

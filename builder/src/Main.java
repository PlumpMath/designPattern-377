/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 22:04
 */
public class Main {

	public static void main(String[] args) {

		Director director = new Director();

		ConcreteBuilder1 b1 = new ConcreteBuilder1();
		ConcreteBuilder2 b2 = new ConcreteBuilder2();

		// --- b1 ---
		director.construct(b1);

		Product p1 = b1.getResult();
		p1.show();

		// --- b2 ---
		director.construct(b2);

		Product p2 = b2.getResult();
		p2.show();
	}
}

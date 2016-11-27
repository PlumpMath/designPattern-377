package noproxy;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 14:35
 */
public class Main {

	public static void main(String[] args) {

		SchoolGirl mm = new SchoolGirl("李娇娇");

		Pursuiter pursuiter = new Pursuiter(mm);

		pursuiter.giveDolls();
		pursuiter.giveChocolate();
		pursuiter.giveFlowers();
	}
}

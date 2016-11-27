package noproxy;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 11:43
 */
public class Pursuiter {

	private SchoolGirl mm;

	/**
	 * @param mm the school girl you want pursuit
	 */
	public Pursuiter(SchoolGirl mm) {
		this.mm = mm;
	}

	public void giveDolls() {
		System.out.println(mm.getName() + ", 送你洋娃娃");
	}

	public void giveFlowers() {
		System.out.println(mm.getName() + ", 送你花");
	}

	public void giveChocolate() {
		System.out.println(mm.getName() + ", 送你巧克力");
	}
}

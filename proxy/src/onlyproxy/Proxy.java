package onlyproxy;

import noproxy.SchoolGirl;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 14:45
 */
public class Proxy {

	private SchoolGirl mm;

	/**
	 * @param mm the school girl you want pursuit
	 */
	public Proxy(SchoolGirl mm) {
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

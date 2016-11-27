package actualproxy;

import noproxy.SchoolGirl;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 14:53
 */
public class Pursuiter implements IGiveGift {

	private String name;
	public String getName() {
		return name;
	}

	private SchoolGirl mm;
	public Pursuiter(String name, SchoolGirl mm) {
		this.name = name;
		this.mm = mm;
	}

	@Override
	public void giveDolls() {
		System.out.println(mm.getName() + ", 送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		System.out.println(mm.getName() + ", 送你花");
	}

	@Override
	public void giveChocolate() {
		System.out.println(mm.getName() + ", 送你巧克力");
	}
}

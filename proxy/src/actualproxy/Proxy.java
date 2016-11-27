package actualproxy;

import actualproxy.*;
import noproxy.SchoolGirl;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 14:55
 */
public class Proxy implements IGiveGift {

	private Pursuiter pursuiter;

	public Proxy(String pursuiterName, SchoolGirl mm) {
		this.pursuiter = new Pursuiter(pursuiterName, mm);
	}

	@Override
	public void giveDolls() {
		System.out.print(pursuiter.getName() + "让我给你, ");
		pursuiter.giveDolls();
	}

	@Override
	public void giveFlowers() {
		System.out.print(pursuiter.getName() + "让我给你, ");
		pursuiter.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		System.out.print(pursuiter.getName() + "让我给你, ");
		pursuiter.giveChocolate();
	}
}

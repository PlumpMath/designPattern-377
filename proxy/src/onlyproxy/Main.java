package onlyproxy;

import noproxy.Pursuiter;
import noproxy.SchoolGirl;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 14:35
 */
public class Main {

	public static void main(String[] args) {

		SchoolGirl mm = new SchoolGirl("李娇娇");

		Proxy proxy = new Proxy(mm);

		proxy.giveDolls();
		proxy.giveChocolate();
		proxy.giveFlowers();
	}
}

package actualproxy;

import noproxy.SchoolGirl;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 15:03
 */
public class Main {

	public static void main(String[] args) {

		SchoolGirl jiaojiao = new SchoolGirl("李娇娇");

		Proxy daili = new Proxy("卓贾易", jiaojiao);

		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}

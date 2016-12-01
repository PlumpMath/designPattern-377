/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 1:00
 */
public class Main {

	public static void main(String[] args) {

		// 开店前准备
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();

		// 开门营业 顾客点菜
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand1);

		// 点菜完毕，通知厨房
		girl.notice();
	}
}

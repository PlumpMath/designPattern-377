/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 22:03
 */
public class SleepingState implements State {

	@Override
	public void writeProgram(Work w) {

		System.out.println("当前时间：" + w.getHour() + "点 不行了，睡着了。");
	}
}

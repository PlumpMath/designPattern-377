/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 21:41
 */
public class ForenoonState implements State {

	@Override
	public void writeProgram(Work w) {

		if(w.getHour() < 12) {	// 是当前状态
			System.out.println("当前时间：" + w.getHour() + "点 上午工作，精神百倍");
		} else {				// 不是当前状态
			w.setState(new NoonState());	// 设置为自认为合适的状态：NoonState
			w.writeProgram();				// 继续，下一步继续判断是否是合适状态,依次继续
		}
	}
}

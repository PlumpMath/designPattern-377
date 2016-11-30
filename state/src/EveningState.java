/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 21:55
 */
public class EveningState implements State {

	@Override
	public void writeProgram(Work w) {

		if(w.isFinish()) {
			w.setState(new RestState());	// 设置到自认为合适的状态
			w.writeProgram();				// 继续，下一步继续判断是否是合适状态,依次继续
		} else {
			if(w.getHour() < 21) {		// 是当前的状态
				System.out.println("当前时间：" + w.getHour() + "点 加班哦，疲惫之极");
			} else {
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}
}

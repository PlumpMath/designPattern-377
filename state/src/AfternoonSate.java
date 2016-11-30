/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 21:52
 */
public class AfternoonSate implements State {

	@Override
	public void writeProgram(Work w) {

		if(w.getHour() < 17) {	// 是当前状态
			System.out.println("当前时间：" + w.getHour() + "点 下午状态还不错，继续努力");
		} else {				// 不是当前状态
			w.setState(new EveningState());	// 设置为自认为合适的状态
			w.writeProgram();				// 继续，下一步继续判断是否是合适状态,依次继续
		}
	}
}

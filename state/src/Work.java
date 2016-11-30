/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 21:41
 */
public class Work {

	private State current;

	private double hour;				// 钟点属性，状态转换的依据
	private boolean finish = false;	// 任务完成属性，是否能下班的依据

	public Work() {
		// 工作初始化为上午工作状态，即上午9点开始上班
		this.current = new ForenoonState();
	}

	public State getState() {
		return current;
	}
	public void setState(State current) {
		this.current = current;
	}

	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	/**
	 * 写程序
	 */
	public void writeProgram() {
		current.writeProgram(this);
	}
}

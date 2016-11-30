/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 22:06
 */
public class Main {

	public static void main(String[] args) {

		Work emergencyProjects = new Work();

		// --------------------------------------------------------------

		emergencyProjects.setHour(9);
		emergencyProjects.writeProgram();

		/**
		 * 以上代码经历的过程：
		 * 		1. Work.writeProgram()
		 * 		2. ForenoonState.writeProgram()， 判断当前work是<12点，输出，执行完毕
		 * 以上代码执行结果：
		 * 		{当前时间：9.0点 上午工作，精神百倍}
		 */

		// --------------------------------------------------------------

		emergencyProjects.setHour(12);
		emergencyProjects.writeProgram();

		/**
		 * 以上代码经历的过程：
		 * 		1. Work.writeProgram()
		 * 		2. ForenoonState.writeProgram()， 判断当前work不是<12点，设置为NoonState状态，继续
		 * 		3. NoonState.writeProgram()， 判断当前work是<13点，输出，执行完毕
		 * 以上代码执行结果：
		 * 		{当前时间：12.0点 饿了，午饭； 犯困，午休。}
		 */

		// ---------------------------------------------------------------

		emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(14);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(17);
		emergencyProjects.writeProgram();

		emergencyProjects.setFinish(true);
		//emergencyProjects.setFinish(false);

		emergencyProjects.setHour(19);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(22);
		emergencyProjects.writeProgram();

		// ---------------------------------------------------------------

		/**
		 * 总结：当work执行时，由当前状态来根据work中字段因素判断，执行当前状态应当作的动作或交给下一个状态
		 */
	}
}

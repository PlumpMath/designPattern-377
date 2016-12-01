/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/1 0:13
 */
public class Main {

	public static void main(String[] args) {

		// 大战Boss前
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();

		// 保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(lixiaoyao.saveState());

		// 大战Boss时，损耗严重
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();

		// 恢复之前的状态
		lixiaoyao.recoveryState(stateAdmin.getMemento());
		lixiaoyao.stateDisplay();
	}
}

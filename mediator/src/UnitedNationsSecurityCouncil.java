/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 18:33
 */
public class UnitedNationsSecurityCouncil implements UnitedNations {

	private USA colleague1;		// 美国
	private Iraq colleague2;		// 伊拉克

	public USA getColleague1() {
		return colleague1;
	}
	public void setColleague1(USA colleague1) {
		this.colleague1 = colleague1;
	}
	public Iraq getColleague2() {
		return colleague2;
	}
	public void setColleague2(Iraq colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void declare(String message, Country colleague) {

		if(colleague == colleague1) {
			colleague2.getMessage(message);
		} else {
			colleague1.getMessage(message);
		}
	}
}

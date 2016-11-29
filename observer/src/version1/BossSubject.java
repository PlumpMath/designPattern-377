package version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 15:04
 */
public class BossSubject implements Subject {

	private List<Observer> os = new ArrayList<Observer>();
	private String state;

	@Override
	public String getSubjectState() {
		return state;
	}

	@Override
	public void setSubjectState(String ss) {
		this.state = ss;
	}

	@Override
	public void attach(Observer o) {
		os.add(o);
	}

	@Override
	public void detach(Observer o) {
		os.remove(o);
	}

	@Override
	public void notice() {

		for (Observer o : os) {

			o.update();
		}
	}
}

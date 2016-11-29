package version2;

import version1.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 15:04
 */
public class SecretarySubject implements Subject {

	private List<EventHandler> handlers = new ArrayList<EventHandler>();

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
	public void addEvent(EventHandler handler) {
		handlers.add(handler);
	}

	@Override
	public void notice() {
		for (EventHandler handler : handlers) {
			handler.handle();
		}
	}
}

package version2;

import java.util.ArrayList;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:46
 */
public interface Subject {

	public String getSubjectState();
	public void setSubjectState(String ss);

	public void addEvent(EventHandler handler);

	public void notice();
}

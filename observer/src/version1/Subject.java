package version1;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:46
 */
public interface Subject {

	public String getSubjectState();
	public void setSubjectState(String ss);

	public void attach(Observer o);
	public void detach(Observer o);
	public void notice();
}

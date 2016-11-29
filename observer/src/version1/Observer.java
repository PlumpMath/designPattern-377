package version1;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:48
 */
public abstract class Observer {

	protected String name;
	protected Subject sub;

	public Observer(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}

	public abstract void update();
}

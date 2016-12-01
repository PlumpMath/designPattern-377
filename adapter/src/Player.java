/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 23:22
 */
public abstract class Player {

	protected String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract void attack();
	public abstract void defense();
}

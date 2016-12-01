/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 23:23
 */
public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("前锋" + name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("前锋" + name + "防守");
	}
}

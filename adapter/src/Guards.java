/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 23:25
 */
public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("后卫" + name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("后卫" + name + "防守");
	}
}

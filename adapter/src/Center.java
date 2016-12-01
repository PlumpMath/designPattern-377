/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 23:24
 */
public class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("中锋" + name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("中锋" + name + "防守");
	}
}

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 22:08
 * 具体网站类
 */
public class ConcreteWebSite extends WebSite {

	private String name = "";

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	@Override
	public void use(User user) {
		System.out.println("网站分类：" + name + " 用户：" + user.getName());
	}
}

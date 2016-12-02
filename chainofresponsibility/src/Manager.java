/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 12:01
 * 管理者
 */
public abstract class Manager {

	protected String name;
	protected Manager superior;	// 管理者的上级

	public Manager(String name) {
		this.name = name;
	}

	/**
	 * 设置管理者的上级
	 * @param superior
	 */
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	/**
	 * 申请请求
	 * @param request
	 */
	public abstract void requestApplication(Request request);

}

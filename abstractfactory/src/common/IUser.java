package common;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 22:47
 */
public interface IUser {

	/**
	 * 插入user数据
	 * @param user user
	 */
	public void insert(User user);

	/**
	 * 获取user对象，根据id
	 * @param id id
	 * @return
	 */
	public User getUser(int id);
}

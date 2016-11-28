/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 22:02
 */
public class Director {

	/**
	 * 组建，依赖接口Builder
	 * @param builder
	 */
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}

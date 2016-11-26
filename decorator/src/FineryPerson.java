/**
 * Created by Administrator on 2016/11/26.
 */
public class FineryPerson extends Person {

	private Person component;

	/**
	 *  指定被装饰者
	 * @param component 被装饰者
	 */
	public void decorate(Person component) {

		this.component = component;
	}

	@Override
	public void show() {

		if(null != component) {
			component.show();
		}
	}
}

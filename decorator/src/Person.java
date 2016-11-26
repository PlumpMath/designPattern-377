/**
 * Created by Administrator on 2016/11/26.
 */
public class Person {

	private String name;

	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("装扮的" + (null == name ? "?" : name));
	}
}

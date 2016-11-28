import java.util.ArrayList;
import java.util.List;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 21:53
 */
public class Product {

	private List<String> parts = new ArrayList<String>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("产品:");
		for (String p : parts) {
			System.out.println(p);
		}
	}
}

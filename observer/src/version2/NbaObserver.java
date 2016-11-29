package version2;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:58
 */
public class NbaObserver {

	private String name;
	private Subject sub;

	public NbaObserver(String name, version2.Subject sub) {
		this.name = name;
		this.sub = sub;
	}

	public void update() {

		System.out.println(sub.getSubjectState() + "" + name + "关闭NBA直播，继续工作！");
	}
}

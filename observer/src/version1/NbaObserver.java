package version1;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/29 14:58
 */
public class NbaObserver extends Observer {

	public NbaObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {

		System.out.println(sub.getSubjectState() + "" + name + "关闭NBA直播，继续工作！");
	}
}

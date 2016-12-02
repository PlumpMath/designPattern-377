/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 12:07
 * 总经理
 */
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {

		if("请假".equals(request.getRequestType())) {
			System.out.println(name + "：" + request.getRequestContent() + "数量" + request.getNumber() + " 被批准");
		} else if("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
			System.out.println(name + "：" + request.getRequestContent() + "数量" + request.getNumber() + " 被批准");
		} else if("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
			System.out.println(name + "：" + request.getRequestContent() + "数量" + request.getNumber() + " 再说吧");
		}
	}
}

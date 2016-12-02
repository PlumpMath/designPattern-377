/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 12:07
 * 经理
 */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {

		if("请假".equals(request.getRequestType()) && 2 >= request.getNumber()) {
			System.out.println(name + "：" + request.getRequestContent() + "数量" + request.getNumber() + " 被批准");
		} else {
			if(null != superior) {
				superior.requestApplication(request);
			}
		}
	}
}

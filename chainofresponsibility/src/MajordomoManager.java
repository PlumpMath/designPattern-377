/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 12:07
 * 总监
 */
public class MajordomoManager extends Manager {

	public MajordomoManager(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {

		if("请假".equals(request.getRequestType()) && 5 >= request.getNumber()) {
			System.out.println(name + "：" + request.getRequestContent() + "数量" + request.getNumber() + " 被批准");
		} else {
			if(null != superior) {
				superior.requestApplication(request);
			}
		}
	}
}

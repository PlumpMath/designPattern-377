/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 12:17
 */
public class Main {

	public static void main(String[] args) {

		CommonManager jinli = new CommonManager("金利");
		MajordomoManager zongjian = new MajordomoManager("宗剑");
		GeneralManager zhongjingli = new GeneralManager("钟精励");

		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjingli);

		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		jinli.requestApplication(request);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		jinli.requestApplication(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		jinli.requestApplication(request3);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		jinli.requestApplication(request4);
	}
}

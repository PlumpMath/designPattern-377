/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 15:50
 */
public abstract class TestPaper {

	public void question1() {

		System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是?[]" +
				"\r\n" +
				"a.球磨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
		String a = answer1();
		System.out.println("答案： " + (null == a ? "无" : a));
	}

	/**
	 * 回答第一个问题
	 * @return 答案
	 */
	public abstract String answer1();

	public void question2() {

		System.out.println("杨过、程英、陆无双铲除了情花，造成[]。" +
				"\r\n" +
				"a.使这种植物不再害人 b.使一种珍稀物种灭绝 c.破坏了那个生物圈的生态平衡 d.造成该地区沙漠化");
		String a = answer2();
		System.out.println("答案： " + (null == a ? "无" : a));
	}

	/**
	 * 回答第二个问题
	 * @return 答案
	 */
	public abstract String answer2();

	public void question3() {

		System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药?[]" +
				"\r\n" +
				"a.阿司匹林 b.牛黄解毒片 c.氟哌酸 d.让他们喝大量的牛奶 e.以上全部对");
		String a = answer3();
		System.out.println("答案： " + (null == a ? "无" : a));
	}

	/**
	 * 回答第三个问题
	 * @return 答案
	 */
	public abstract String answer3();
}

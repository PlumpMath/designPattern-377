package shallow2;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 23:51
 * 用于第二版浅复制的运行
 */
public class Main {

	public static void main(String[] args) {

		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", 29);
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = (Resume)a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = (Resume)a.clone();
		c.setPersonalInfo("男", 24);

		a.display();
		b.display();
		c.display();
	}
}

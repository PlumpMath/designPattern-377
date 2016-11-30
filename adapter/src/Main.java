/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/30 23:30
 */
public class Main {

	public static void main(String[] args) {

		Player b = new Forwards("巴蒂尔");
		b.attack();

		Guards m = new Guards("麦克格雷迪");
		m.attack();

		Translator ym = new Translator("姚明");
		ym.attack();
		ym.defense();
	}
}

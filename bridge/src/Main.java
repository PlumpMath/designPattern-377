/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/2 0:11
 */
public class Main {

	public static void main(String[] args) {

		HandsetBrand ab;

		ab = new HandsetBrandN();

		ab.setHandsetSoft(new HandsetGame());
		ab.run();

		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();

		ab = new HandsetBrandM();

		ab.setHandsetSoft(new HandsetGame());
		ab.run();

		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
	}
}

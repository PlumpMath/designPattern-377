package leifeng;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 23:08
 */
public class Main {

	public static void main(String[] args) {

		UndergraduateFactory uf = new UndergraduateFactory();

		LeiFeng undergraduate = uf.createLeiFeng();

		undergraduate.buyRice();
		undergraduate.sweep();
		undergraduate.wash();
	}
}

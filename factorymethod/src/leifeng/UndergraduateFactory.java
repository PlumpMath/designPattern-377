package leifeng;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 23:05
 */
public class UndergraduateFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {

		return new Undergraduate();
	}
}

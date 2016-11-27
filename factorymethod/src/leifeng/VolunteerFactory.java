package leifeng;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 23:07
 */
public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {

		return new Volunteer();
	}
}

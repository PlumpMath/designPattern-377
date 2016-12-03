/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 11:29
 * 音阶类
 */
public class Scale extends Expression {

	@Override
	public void excute(String key, double value) {

		String scale = "";

		switch ((int)value) {

			case 1:
				scale = "低音";
				break;
			case 2:
				scale = "中音";
				break;
			case 3:
				scale = "高音";
				break;
		}

		System.out.print(scale);
	}
}

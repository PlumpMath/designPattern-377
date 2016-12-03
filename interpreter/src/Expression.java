/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/12/3 11:16
 * 表达式类
 */
public abstract class Expression {

	/**
	 * 解释器
	 * @param context
	 */
	public void interpret(PlayContext context) {

		if (context.getText().length() == 0) {
			return ;
		} else {

			// 获取文本的第一条命令的字母， 如"O 3 E 0.5 G 0.5 A 3"，则playKey则为O，然后从文本中将其移除
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));

			// 获取文本第一条命令的参数值， 如"O 3 E 0.5 G 0.5 A 3"，则playValue则为3，然后从文本中将其移除
			double playValue = Double.valueOf(context.getText().substring(0, context.getText().indexOf(" ")));
			context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

			// 执行
			excute(playKey, playValue);
		}
	}

	/**
	 * 执行，不同的文法子类，有不同的执行处理
	 * @param key
	 * @param value
	 */
	public abstract void excute(String key, double value);
}

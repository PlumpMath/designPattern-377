/**
 * Created by Administrator on 2016/11/26.
 */
public class Run {

	public static void main(String[] args) {

		Person p = new Person("哈哈");

		TShirtPerson ts = new TShirtPerson();
		BigTourserPerson bt = new BigTourserPerson();

		bt.decorate(p);
		ts.decorate(bt);

		ts.show();
	}
}

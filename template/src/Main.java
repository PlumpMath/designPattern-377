/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 16:04
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("学生甲抄的试卷：");
		TestPaperA a = new TestPaperA();
		a.question1();
		a.question2();
		a.question3();

		System.out.println("学生乙抄的试卷：");
		TestPaperB b = new TestPaperB();
		b.question1();
		b.question2();
		b.question3();
	}
}

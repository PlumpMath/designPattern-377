package shallow1;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/27 23:36
 * need implements Cloneable, if not, run clone() method will throw exception: CloneNotSupportedException
 */
public class Resume implements Cloneable {

	private String name;
	private String gender;
	private int age;
	private String timeArea;
	private String company;

	public Resume(String name) {
		this.name = name;
	}

	public void setPersonalInfo(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}

	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	public void display() {
		System.out.println(name + " " + gender + " " + age);
		System.out.println("工作经历: " + timeArea + " " + company);
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}

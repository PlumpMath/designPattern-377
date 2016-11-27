package shallow2;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 0:11
 */
public class Resume implements Cloneable {

	private String name;
	private String gender;
	private int age;

	private WorkExperience work;

	public Resume(String name) {
		this.name = name;
		this.work = new WorkExperience();
	}

	public void setPersonalInfo(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}
	public void setWorkExperience(String timeArea, String company) {
		work.setTimeArea(timeArea);
		work.setCompany(company);
	}

	public void display() {
		System.out.println(name + " " + gender + " " + age);
		System.out.println("工作经历: " + work.getTimeArea() + " " + work.getCompany());
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

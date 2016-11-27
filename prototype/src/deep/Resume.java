package deep;


/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 0:11
 */
public class Resume implements Cloneable {

	private String name;
	private String gender;
	private int age;

	private WorkExperience work;

	public Resume() {}
	public Resume(String name) {
		this.name = name;
		this.work = new WorkExperience();
	}
	public Resume(WorkExperience work) {
		this.work = work.clone();
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
	public Resume clone() {

		Resume resume = new Resume(this.work);
		resume.name = this.name;
		resume.age = this.age;
		resume.gender = this.gender;

		return resume;

		// 以下方式也可以
		/*Resume r = new Resume();
		r.name = this.name;
		r.age = this.age;
		r.gender = this.gender;
		r.work = this.work.clone();
		return r;*/
	}
}

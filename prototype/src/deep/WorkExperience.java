package deep;

/**
 * @Author Clement[clement009@hotmail.com]
 * @Date 2016/11/28 0:21
 */
public class WorkExperience implements Cloneable {

	private String timeArea;
	private String company;

	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public WorkExperience clone() {
		try {
			return (WorkExperience)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}

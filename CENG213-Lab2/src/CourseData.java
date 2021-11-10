
public class CourseData {

	// INSTANCE VARIABLES +++++++++++++++++++++++++++++++++
	public String code;
	public String name;
	public String grade;
	public int credit;
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++
	public CourseData(String code, String name, int cred) {
		this.code = code;
		this.name = name;
		this.credit = cred;
	}

	// GETTERS AND SETTERS +++++++++++++++++++++++++++++++++++++++
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getCredit() {
		return credit;
	}

}

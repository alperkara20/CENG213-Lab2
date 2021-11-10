
public class Student{
	// INSTANCE VARIABLES +++++++++++++++++++++++++++++++++
	private String student_number;
	private String student_name;
	private int enrollment_year = -1;
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++
	public Student(String stud_no, String stud_name, int enroll_year) {
		this.student_number = stud_no;
		this.student_name = stud_name;
		this.enrollment_year = enroll_year;
		
	}
	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++

	public void addCourse() {
		
	}
	
	//public boolean checkCourse() {
		
	//}
	
	public void setCourseGrade() {
		
	}
	
	//public double getGDA() {
		
	//}
	
	// GETTERS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String getStudent_number() {
		return student_number;
	}

	public String getStudent_name() {
		return student_name;
	}

	public int getEnrollment_year() {
		return enrollment_year;
	}
}

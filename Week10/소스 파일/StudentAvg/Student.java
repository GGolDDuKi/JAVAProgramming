
public class Student {
	private String name;
	private String major;
	private String id;
	private double grade;
	
	public Student() {}
	public Student(String name, String major, String id, double grade) {
		this.name = name;
		this.major = major;
		this.id = id;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
}

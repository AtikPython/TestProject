package HospitalBilling;

public class DoctorsInformation extends Hospital {
	private String name;
	private int age;
	private String department;
	private String degree;
	
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
    void allInformation() {
		System.out.println("\nDoctor name: "+name);
		System.out.println("Doctor age: "+age);
		System.out.println("Doctor department: "+department);
		System.out.println("Doctor degree: "+degree);
	}


}

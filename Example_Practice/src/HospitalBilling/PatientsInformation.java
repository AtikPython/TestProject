package HospitalBilling;

public class PatientsInformation extends Hospital {
	private String name;
	private int age;
	private int contactNo;
	
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
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
    void allInformation() {
		System.out.println("Patients Name: "+name);
		System.out.println("Patients Age: "+age);
		System.out.println("Patients contactNo: "+contactNo);
	}
	
	

}

package Encapsulation;

public class Test {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("Atik");
		student.setId(1001);
		
	    System.out.println("Name is: "+student.getName());
	    System.out.println("Id is: "+student.getId());
	}

}

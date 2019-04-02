package Person;

public class Main {

	    public static void main(String[] args) {

	       Address presentAddress = new Address(
	                "H # 11",
	                "R#14",
	                "Dhanmondi",
	                "Dhaka",
	                "Dhaka",
	                "Bangladesh",
	                "1207"
	        );

	        Address permanentAddress = new Address(
	                "H#11",
	                "R#14",
	                "Meherpur",
	                "Meherpur",
	                "Khulna",
	                "Bangladesh",
	                "7100"
	        );

	        Person father = new Person("Rezaul Karim");
	        father.setPhone("24434");
	        Person mother = new Person("Rowshan Ara");

	        Person rashed = new Person("Rashed Karim");
	        rashed.setPermanentAddress(permanentAddress);
	        rashed.setPresentAddress(presentAddress);
	        rashed.setFather(father);
	        rashed.setMother(mother);
	        rashed.setEmail("mail4rashed@gamil.com");
	        rashed.setPhone("01711605286");
	        System.out.println(rashed.toString());
	        //System.out.println(rashed.getFather().toString());

	    }
	}



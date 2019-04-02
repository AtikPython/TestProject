package Person;

public class Person {
	    private String name;
	    private String phone;
	    private String email;
	    private Address presentAddress;
	    private Address permanentAddress;
	    private Person father;
	    private Person mother;

	    @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", phone='" + phone + '\'' +
	                ", email='" + email + '\'' +
	                ", presentAddress=" + presentAddress +
	                ", permanentAddress=" + permanentAddress +
	                ", father=" + father +
	                ", mother=" + mother +
	                '}';
	    }

	    public Person(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Address getPresentAddress() {
	        return presentAddress;
	    }

	    public void setPresentAddress(Address presentAddress) {
	        this.presentAddress = presentAddress;
	    }

	    public Address getPermanentAddress() {
	        return permanentAddress;
	    }

	    public void setPermanentAddress(Address permanentAddress) {
	        this.permanentAddress = permanentAddress;
	    }

	    public Person getFather() {

	        return father;
	    }

	    public void setFather(Person father) {
	        this.father = father;
	    }

	    public Person getMother() {
	        return mother;
	    }

	    public void setMother(Person mother) {
	        this.mother = mother;
	    }
	}


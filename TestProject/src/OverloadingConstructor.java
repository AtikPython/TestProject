public class OverloadingConstructor {
	
	String name,gender;
	int phone;
	
	OverloadingConstructor(){
		System.out.println("No information\n");
	}
	OverloadingConstructor(String n,String g){
		name = n;
		gender = g;
	}
	OverloadingConstructor(String n,String g,int p){
		name = n;
		gender = g;
		phone = p;
	}
	void Display() {
		System.out.println("Name is:"+name);
		System.out.println("Gender is:"+gender);
		System.out.println("Phone is:"+phone);
		
	}
	
	public static void main(String[] args) {
		OverloadingConstructor teacher1 = new OverloadingConstructor();
		teacher1.Display();
		System.out.println("\n");
		
		OverloadingConstructor teacher2 = new OverloadingConstructor("Atik","Male");
		teacher2.Display();
		System.out.println("\n");
		
		OverloadingConstructor teacher3 = new OverloadingConstructor("Orsha","Female",1800000000);
		teacher3.Display();
	}

}

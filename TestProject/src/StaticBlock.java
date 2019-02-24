
public class StaticBlock {
	
	static int id;
	static String name;
	
	static {
		id = 10001;
		name = "Atik";	
	}
	static void Display() {
		System.out.println("Your Id Is:"+id);
		System.out.println("Your Name Is:"+name);
	}
	
	public static void main(String[] args) {
		StaticBlock.Display();
		
	}

}

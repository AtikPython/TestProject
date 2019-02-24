package Super;

public class Dog extends Animal {
	String color = "Black";
	void printColor() {
		System.out.println(super.color);
		System.out.println(color);
		
	}
	void cat() {
		System.out.println("Cat also can eat :)");
	}
	void work() {
		super.cat();
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.printColor();
		Dog cat = new Dog();
		cat.work();
	    dog.cat();
	}

}

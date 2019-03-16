package OverloadingConstructor;

public class OverloadingMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.Display();
        System.out.println("\n");
        
        
        Teacher teacher2 = new Teacher("Atik","Male");
        teacher2.Display();
        System.out.println("\n");
        
        Teacher teacher3 = new Teacher("Orsha","Feamale",1919591892);
        teacher3.Display();
    }
    
}

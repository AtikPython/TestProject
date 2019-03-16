
package StaticVariable;

public class Student {
    String name;
    int id;
    static String universityName = "DIU";
    
    Student(String n,int i){
        name = n;
        id = i;
        
    }
    void Display(){
        System.out.println("\nName:"+name);
        System.out.println("Id:"+id);
        System.out.println("universityName:"+universityName);
    }
    
}

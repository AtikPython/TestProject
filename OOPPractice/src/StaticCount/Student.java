package StaticCount;

public class Student {

    static int count = 0;

    Student() {
        count++;       
    }
    void Display(){
        System.out.println("Student: " + count);
    }
}

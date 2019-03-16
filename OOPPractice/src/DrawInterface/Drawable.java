package DrawInterface;

public interface Drawable {

    void Draw();
    
    default void showe(){
        System.out.println("DM");
    }
    static void staticmethod(){
        
    }

    interface showable {

        void show();
    }

}


package DrawInterface;

public class Circle implements Drawable,Calculate,Drawable.showable {
    @Override
    public void Draw(){
        System.out.println("Circle");
    }
    @Override
    public int CalArea(int a,int b){
    return a*b;
}
    @Override
    public void show(){
        System.out.println("show me");
    }
}

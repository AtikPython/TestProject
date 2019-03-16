
package Abstract;

public abstract class Shape {
    double d1,d2;
    
    Shape(double d1,double d2){
        this.d1 = d1;
        this.d2 = d2;               
    }
    abstract void area();
}

import java.util.*;
// base class/parents class
class Shape{
    String color;
}
// subclass/child class
class Triangle extends Shape{

}
// multi base inheritence
class Shap{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangl extends Shap{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateraTrinagle extends Triangl{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
// HIERACHIAL INHERITANCE
class Sha{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triang extends Sha{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Sha{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
// HYBRID INHERITANCE
public class OOps_inheritence {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="Red";
    }
}

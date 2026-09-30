package inheritances;

abstract class shape{
    abstract double area();
    void describe (){
        System.out.println("I am a shape");
    }
}
class circle  extends shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }

}
public class abstracts{
    public static void main(String[] args) {
        shape s=new circle(5);
        s.describe();
    }
}



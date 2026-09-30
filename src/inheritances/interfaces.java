package inheritances;

interface moveable{
    void move();
}
interface soundable{
    void sound();
}
class ronaldo implements soundable,moveable{
    @Override
    public void sound() {
        System.out.println("Ronaldo sound");
    }
    @Override
    public void move() {
        System.out.println("Ronaldo move");
    }
}
public class interfaces{
    public static void main(String[] args) {
        ronaldo r=new ronaldo();
        r.move();
        r.sound();
    }
}

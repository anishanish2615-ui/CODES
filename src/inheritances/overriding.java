package inheritances;

class Animal {
    void makesound() {
        System.out.println("Animal makesound");
    }
}
class cat extends Animal {
    @Override
    void makesound() {
        System.out.println("bark");
    }
}
public class overriding {
    public static void main(String[] args) {
        Animal a = new cat();
        a.makesound();
    }
}


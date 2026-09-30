package inheritances;

class Animalss{
    void makesound() {
        System.out.println("......");
    }

}
class dogs extends Animalss{
    void makesound() {
        System.out.println("dog is barking");
    }

}
class cats extends Animalss{
    void makesound() {
        System.out.println("cat is making some sort of sound ");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Animalss[] animalss = {new dogs(),new cats()};
        for(Animalss a: animalss ){
            a.makesound();
        }
    }
}
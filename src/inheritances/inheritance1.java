package inheritances;

    class
    animals{
        String name;
        animals (String name){
            this.name=name;
        }
        void eat(){
            System.out.println(name+"is eating");
    }

    }
    class dog extends animals{
        String name;
        dog (String name){
            super(name);
        }
        void bark(){
            System.out.println(name+"saya woof");

        }
    }
public class inheritance1{
    public static void main(String[] args) {
        dog dog=new dog("rex");
        dog.eat();
        dog.bark();

    }
}







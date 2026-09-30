package oops;

public class class2 {
    public static void main(String[] args) {
        dog mydog=new dog("rex ",18);
        mydog.bark();

    }
}

    class dog {
        String name;
        int age;

        dog(String name, int age) {
            this.name = name;
            this.age = age;

        }

        void bark() {
            System.out.println(name + "says bark and is " + age + " year old");
        }
    }









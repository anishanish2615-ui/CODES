package controlflow;

public class ifelse {
    public static void main(String[] args) {
        int age=24;
        if(age<18){
            System.out.println("you are a child");
        } else if (age>=18&&age<24) {
            System.out.println("you are a adult");

        }
        else{
            System.out.println("you are a old enough to be called uncle");
        }
    }
}

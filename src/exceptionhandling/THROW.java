package exceptionhandling;

public class THROW{
static void checkage(int age){
    if(age<0){
        throw new IllegalArgumentException("age cannot be negative");

    }
    System.out.println("Age is valid"+age);
}
    public static void main(String[] args) {
        checkage(-5);
        System.out.println("this line never runs");
    }
}







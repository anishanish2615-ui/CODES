package exceptionhandling;

public class multicatch {
    public static void main(String[] args) {
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[7]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds");
        }catch(Exception e){
            System.out.println("something went wrong"+e.getMessage());
        }

    }
}

package GENERICS;

public class Boundedtypeparameters {
    public static void main(String[] args) {
        class numberbox <T extends Number>{
            private T value;
            numberbox(T value){
                this.value=value;
            }
            double doubled(){
                return value.doubleValue()*2;

            }
        }
        numberbox <Integer> box= new numberbox<>(5);
        System.out.println(box.doubled());
    }
}

package GENERICS;

class utils{
    static <T> void printarray(T[]Array){
        for(T item:Array){
            System.out.println(item);
        }
    }
}
public class gen3 {
    public static void main(String[] args) {
        Integer[]nums={1 ,2 ,3 ,4 ,5 };
        String[]str={"a ","b ","c ","d ","e"};


        utils.printarray(nums);
        utils.printarray(str);

    }
}
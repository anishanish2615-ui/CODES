package controlflow;

import java.util.List;
import java.util.ArrayList;

public class foreachloop {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("anish");
        list.add("ANLIN");
        list.add("NISHIMA");
        list.add("HERE SHE COMES WALKING DOWN THE STREET ");
        for(String p:list){
            System.out.println(p);
        }


    }
}

package collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ITERATOR {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>(List.of("anish","Anlin","cephas"));

        Iterator<String>it=names.iterator();
        while(it.hasNext()){
            String name=it.next();
            if(name.equals("anish")){
                it.remove();
            }
        }
        System.out.println(names);
    }
}

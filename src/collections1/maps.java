package collections1;

import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("anish ", 18);
        ages.put("max ", 26);
        ages.put("leclerc ", 27);

        System.out.println(ages);
        System.out.println(ages.containsKey("max"));

        for(String names : ages.keySet()){
            System.out.println(names+"is "+ages.get(names));

        }


    }
}

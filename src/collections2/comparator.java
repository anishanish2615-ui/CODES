package collections2;

import java.util.ArrayList;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        class person{
            String name;
            int age;

            person(String name,int age){
                this.name=name;
                this.age=age;
            }
            public  String toString(){
                return name+"("+age+")";

            }
        }
        List<person> persons=new ArrayList<>();
        persons.add(new person("sarah",30));
        persons.add(new person("james",28));
        persons.add(new person("Anlin",40));

        persons.sort((p1,p2)->p1.age-p2.age);
        System.out.println(persons);

        persons.sort((p1,p2)->p1.name.compareTo(p2.name));
        System.out.println(persons);
    }
}

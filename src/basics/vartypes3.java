package basics;

import java.util.ArrayList;
import java.util.List;

public class vartypes3
{
    public static void main(String[] args)
    {
        int age=18;
        double height=19.9;
        boolean isEqual=(age==25);
        char gender='M';
        String name="JOHN";
        List list=new ArrayList();
        list.add("age:"+age);
        list.add("height:"+height);
        list.add("valid:"+isEqual);
        list.add("gender:"+gender);
        list.add("name:"+name);



        System.out.println(list);

    }
}

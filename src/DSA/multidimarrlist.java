package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class multidimarrlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());


            for(int j = 0; j < 3; j++){
                int n=sc.nextInt();
                list.get(i).add(n);

                //System.out.println(list);

            }
        }
       System.out.println(list);
    }
}

package DSA;

import java.util.Arrays;

public class changevalue {
   public static void main(String[] args) {
       int[]arr={1,23,4,5,6};
       change(arr);
       System.out.println(Arrays.toString(arr));


    }
    static void change(int[]num){
       num[0]=99;
       num[1]=100;


    }
}

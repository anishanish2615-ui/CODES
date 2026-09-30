package methods;

import java.util.Scanner;

public class method2 {
    static boolean f1(int age){
        if(age<18){
            return false;
        }
        else {
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(f1(age));

    }
}

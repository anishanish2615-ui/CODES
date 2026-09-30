package basics;

import java.util.Scanner;

public class vartypes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(num>=18){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

    }
}

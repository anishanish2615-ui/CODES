package DSA;

import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        for (int i = 100; i < 1000; i++) {
            if (IsArmstrong(i)) {
                System.out.println(i + " ");
            }

        }
    }

    static boolean IsArmstrong(int n) {
        int original= n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;


        }
        return original == sum;

    }
}



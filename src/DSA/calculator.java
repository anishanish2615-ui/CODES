package DSA;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int anss=0;


        while(true) {
            System.out.println("enter a operator");

            char ch=sc.next().trim().charAt(0);
            System.out.println("enter two_ number");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            if(ch=='+') {
                anss=num1+num2;

            }
            if(ch=='-') {
                anss=num1-num2;

            }
            else if (ch=='x'||ch=='x') {
                break;

            }else {
                System.out.println("invalid operator");
            }
            System.out.println(anss);
        }
    }
}

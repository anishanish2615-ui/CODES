package oops;

import java.util.Scanner;
public class privategetterssetters {
    public static void main(String args[]) {
        bankaccount acc = new bankaccount(100);
        acc.deposit(50);
        System.out.println(acc.getbalance());
    }
}


    class bankaccount{
        private double balance;
        bankaccount(double startingbalance){
            balance=startingbalance;
        }
        void deposit(double amount){
            if (amount>0){
                balance=balance+amount;

            }
        }
        double getbalance(){
            return balance;
        }



}



package exceptionhandling;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bankaccount{
    double balance=100;

    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("insufficient funds");

        }
        balance=balance-amount;
    }
}
public class custom {
    public static void main(String[] args){
        Bankaccount acc=new Bankaccount();
        try {
            acc.withdraw(200);
        }catch (InsufficientBalanceException e){
            System.out.println("caught "+e.getMessage());
        }
    }
}


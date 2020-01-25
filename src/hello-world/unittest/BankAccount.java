package unittest;

public class BankAccount {
    private String firstname;
    private String lastname;
    private double balance;
    public BankAccount(String firstname, String lastname, double balance){
        this.firstname = firstname;
        this.lastname=lastname;
        this.balance=balance;
    }

    public double deposit(double amount, boolean branch){
        balance+=amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        balance -=amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }
}

package exercicioSecao9.bancoExer.entities;

public class AccountBank {

    private int numAccount;
    private String holder;
    private double balance;

    public AccountBank() {
    }

    public AccountBank(int numAccount, String holder) {
        this.numAccount = numAccount;
        this.holder = holder;
    }

    // se o user optar depositar quando criar a conta
    public AccountBank(int numAccount, String holder, double balance) {
        this.numAccount = numAccount;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account: "
                + numAccount
                + ", Holder: " + holder
                + ", Balance: $ " + String.format("%.2f", balance);
    }
}

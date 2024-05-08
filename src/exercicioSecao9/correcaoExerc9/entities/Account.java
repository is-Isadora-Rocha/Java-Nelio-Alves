package exercicioSecao9.correcaoExerc9.entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    // sobrecarga
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }
    // sobrecarga
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    // só pode ser alterado por meio de saque e depósito
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
                + number
                + ", Holder: " + holder
                + ", Balance: $ " + String.format("%.2f", balance);
    }
}

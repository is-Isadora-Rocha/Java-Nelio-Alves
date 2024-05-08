package exercicioSecao9.bancoExer.entities;

public class AccountBank {
    private int acount;
    private String name;
    private double initDeposit;
    private int quantity;

    public AccountBank(int acount, String name, double initDeposit) {
        this.acount = acount;
        this.name = name;
        this.initDeposit = initDeposit;
    }

    public AccountBank(int quantity) {}

    public AccountBank() {}

    public int getAcount() { return acount; }
/*
    ## Inativo pois não pode ser alterado ##
   public void setAcount(int acount) {
        this.acount = acount;
    }
*/

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitDeposit() {
        return initDeposit;
    }

    public void setInitDeposit(double initDeposit) {
        this.initDeposit = initDeposit;
    }

    public int getQuantity() {
        return quantity;
    }
/*
    ## Inativo para proteger o obj Banco de inserções de quantidade ##

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
*/

    public void addDeposit(int quantity) {
        this.quantity += quantity;
    }
    public void withdrawDeposit(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "acount=" + acount +
                ", name='" + name + '\'' +
                ", initDeposit=" + initDeposit +
                '}';
    }
}

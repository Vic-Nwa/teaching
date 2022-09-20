public class BankAccount {
    private String name;
    private double balance;
    // constructor
    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    // 3 Methods
    @Override
    public String toString(){
        return this.name + ", $" + this.balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

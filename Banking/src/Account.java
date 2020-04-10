public class Account {
    private double balance;

    //Account constructor
    public Account(int balance) {
        if (balance <= 0) this.balance = 0;
        else this.balance = balance;
    }

    //Get balance
    public double getBalance() {
        return balance;
    }

    //Deposit money
    public boolean deposit(int amount) {
        if (amount <= 0) return false;
        this.balance += amount;
        return true;
    }

    //Withdraw money
    public boolean withdraw(int amount) {
        if (amount <= 0 || amount < this.balance) return false;
        this.balance -= amount;
        return true;
    }
}

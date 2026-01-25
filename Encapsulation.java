
class BankAccount {
    // Private data members (data hidden)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter method
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Pravin", 5000);

        acc.deposit(2000);
        acc.withdraw(1000);

        // Accessing balance only through public method
        System.out.println("Final Balance: " + acc.getBalance());
    }
}

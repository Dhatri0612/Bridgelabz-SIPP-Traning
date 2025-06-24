public class BankAccount {
    public int accountNumber;      // Public variable
    protected String accountHolder; // Protected variable
    private double balance;        // Private variable

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }

    // MAIN method to test BankAccount class
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount acc = new BankAccount(1001, "John", 5000);

        // Display account details
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Account Holder: " + acc.accountHolder);
        System.out.println("Balance: " + acc.getBalance());

        // Deposit some amount
        acc.deposit(2000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}

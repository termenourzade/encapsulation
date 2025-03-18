public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "$" + " has been deposited into account " + accountNumber);
        } else {
            System.out.println("amount can not be negative!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("amount can not be negative!");
        } else {
            balance -= amount;
            System.out.println(amount + "$" + " has been withdrawn from account " + accountNumber + " in the name " + accountHolderName);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

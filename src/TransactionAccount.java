public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("no interest for transaction account " + getAccountNumber());
    }

    @Override
    public void withdraw(double amount) {
        if (amount > overDraftLimit + balance) {
            System.out.println("insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("amount can not be negative!");
        } else {
            balance -= amount;
            System.out.println(amount + "$" + " has been withdrawn from account " + getAccountNumber() + " in the name " + getAccountHolderName());
        }
    }

}

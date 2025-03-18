public class Main {
    public static void main(String[] args) {
        BankCustomers bankCustomers = new BankCustomers();

        TransactionAccount transactionAccount1 = new TransactionAccount("123", "terme", 100);
        TransactionAccount transactionAccount2 = new TransactionAccount("456", "mina", 200);
        TransactionAccount transactionAccount3 = new TransactionAccount("789", "roya", 300);

        SavingAccount savingAccount1 = new SavingAccount("321", "sama", 400);
        SavingAccount savingAccount2 = new SavingAccount("654", "aria", 500);
        SavingAccount savingAccount3 = new SavingAccount("987", "amin", 600);

        bankCustomers.addAccount(transactionAccount1);
        bankCustomers.addAccount(transactionAccount2);
        bankCustomers.addAccount(transactionAccount3);
        bankCustomers.addAccount(savingAccount1);
        bankCustomers.addAccount(savingAccount2);
        bankCustomers.addAccount(savingAccount3);

        bankCustomers.findAccount("123");
        bankCustomers.findAccount("345");
        System.out.println();

        System.out.println("initial balance of account 123: " + transactionAccount1.getBalance());
        transactionAccount1.deposit(200);
        System.out.println("new balance of account 123: " + transactionAccount1.getBalance());
        System.out.println();

        System.out.println("balance of account 456: " + transactionAccount2.getBalance());
        transactionAccount2.deposit(-200);
        System.out.println("balance of account 456: " + transactionAccount2.getBalance());
        System.out.println();

        savingAccount1.calculateInterest();
        transactionAccount1.calculateInterest();
        System.out.println();

        System.out.println("initial balance of account 321: " + savingAccount1.getBalance());
        System.out.println("initial balance of account 123: " + transactionAccount1.getBalance());
        System.out.println();

        transactionAccount1.withdraw(50);
        transactionAccount2.withdraw(-50);
        transactionAccount3.withdraw(1000);
        System.out.println();

        savingAccount1.withdraw(100);
        savingAccount2.withdraw(-100);
        savingAccount3.withdraw(700);
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        bankCustomers.showAllBalances();
        System.out.println("--------------------------------------------------------------------");
    }
}

public class Bank {
    private double amount;

    // Parameterized constructor to initialize amount
    public Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw from account
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to deposit into account
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Method to display total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Create an instance of Bank with initial amount 10000
        Bank account = new Bank(10000);

        // Withdraw 5000 from account
        account.withdraw(5000);

        // Deposit 5000 into account
        account.deposit(5000);

        // Display total balance
        account.displayBalance();
    }
}

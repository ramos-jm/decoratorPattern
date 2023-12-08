package SoftEng1.decoratorPattern;

public class SavingsAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Displays Savings Account
    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    // Interest Rate for UpSave
    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    // get Balance
    @Override
    public Double getBalance() {
        return balance;
    }

    // Displays Standard Savings Account
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    // Total Computed Balance for Savings Account
    @Override
    public Double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }

    // User Info
    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n" +
                "Account name: " + accountName + "\n" +
                "Balance: " + balance;
    }
}

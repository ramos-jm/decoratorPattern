package SoftEng1.decoratorPattern;

public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;

    // Constructor that associates an UpSave with an existing bank account
    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Method to set the underlying bank account
    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Shows UpSave
    @Override
    public String showAccountType() {
        return "UpSave";
    }

    // Interest Rate for UpSave
    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    // Get Balance
    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    // Displays Standard Savings Account, plus Insurance
    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    // Total Computed Balance for UpSave
    @Override
    public Double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }

    // User Info
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}

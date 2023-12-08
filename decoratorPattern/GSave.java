package SoftEng1.decoratorPattern;

public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;


    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Shows GSave
    @Override
    public String showAccountType() {
        return "GSave";
    }

    // Interest Rate for GSave
    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    // get Balance
    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    // Displays GCash Transfer, Standard Savings Account
    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    // Total Computed Balance for GSave
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

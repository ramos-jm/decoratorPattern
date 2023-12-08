# Problem

CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

<li>The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the <br>"Standard Savings Account" as compared to other banks.

<li>The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

<li>The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".


<br>The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :

![image](https://github.com/ramos-jm/decoratorPattern/assets/127398189/ddd61edd-0a09-48f5-8d9d-6c79069cad1c)

You should display the following output:<br>
![image](https://github.com/ramos-jm/decoratorPattern/assets/127398189/67f24d2c-0d58-4106-b552-ec00355b20d2)

Description of the following methods<br>

1. <b>showAccountType()</b> - Either returns "Savings Account", "GSave" or "UpSave"
2. <b>getInterestRate()</b> - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave
3. <b>getBalance()</b> - Returns the balance of the account set.
4. <b>showBenefits()</b> - Either returns "Standard Savings Account" for Savings Account; 
<br>benefits offered by savings account + "GSave Transfer";
<br>benefits offered by savings account + "With Insurance";
5. <b>computeBalanceWithInterest()</b> - returns new balance by computing the balance plus the interest depending on the interest rate.
6. <b>showInfo()</b> - Returns details of account number, account name, and balance.

<b>BankAcountDecorator</b> must be an interface.<br>


Follow instructions.  You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).<br>

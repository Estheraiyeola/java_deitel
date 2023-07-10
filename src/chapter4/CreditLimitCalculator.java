package chapter4;

public class CreditLimitCalculator {

    private int accountNumber;
    private int balance;
    private int totalItemsCharged;
    private int totalCredits;
    private int creditLimit;


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setItemsCharged(int totalItemsCharged) {
        if (totalItemsCharged > 0){
            this.totalItemsCharged = totalItemsCharged;
        }
    }

    public int getItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getCredits() {
        return totalCredits;
    }

    public void setCreditLimit(int creditLimit) {
        if (creditLimit > 0) {
            this.creditLimit = creditLimit;
        }
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public  void calculateBalance(){
        this.balance = balance + totalItemsCharged -totalCredits;
        System.out.println(balance);
        if (balance > creditLimit){
            System.out.println("Credit limit exceeded");
        }
    }
}

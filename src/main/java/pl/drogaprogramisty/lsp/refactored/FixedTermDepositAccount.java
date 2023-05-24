package pl.drogaprogramisty.lsp.refactored;

class FixedTermDepositAccount {
    private final int balance;
    private final double interestPercentage;

    public FixedTermDepositAccount(int startingBalance,
                                   double interestPercentage) {
        this.balance = startingBalance;
        this.interestPercentage = interestPercentage;
    }

    //no "withdraw" method.
//    public void withdraw(int amount) {
//        throw new RuntimeException("You cannot withdraw from FixedTermDepositAccount!");
//    }
    public int getBalance() {
        return balance;
    }

    public double getInterestPercentage() {
        return interestPercentage;
    }
}

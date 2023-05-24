package pl.drogaprogramisty.lsp.violated;

class FixedTermDepositAccount extends BankAccount {

    private final double interestPercentage;

    public FixedTermDepositAccount(int startingBalance,
                                   double interestPercentage) {
        super(startingBalance);
        this.interestPercentage = interestPercentage;
    }

    @Override
    public void withdraw(int amount) {
        throw new RuntimeException("You cannot withdraw from FixedTermDepositAccount!");
    }

    public double getInterestPercentage() {
        return interestPercentage;
    }
}

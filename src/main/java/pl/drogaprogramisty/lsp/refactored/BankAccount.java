package pl.drogaprogramisty.lsp.refactored;

class BankAccount {
    private int balance;

    public BankAccount(int startingBalance) {
        this.balance = startingBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}

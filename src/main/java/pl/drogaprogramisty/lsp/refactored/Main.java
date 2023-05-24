package pl.drogaprogramisty.lsp.refactored;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getBalance());

        FixedTermDepositAccount fixedTermDepositAccount
                = new FixedTermDepositAccount(100, 0.07);
        System.out.println(fixedTermDepositAccount.getBalance());
        System.out.println(fixedTermDepositAccount.getInterestPercentage());
    }
}

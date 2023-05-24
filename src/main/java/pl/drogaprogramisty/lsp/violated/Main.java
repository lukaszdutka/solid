package pl.drogaprogramisty.lsp.violated;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getBalance());

        BankAccount bankAccount2 = new FixedTermDepositAccount(100, 0.07);
        System.out.println(bankAccount2.getBalance());
        bankAccount2.withdraw(10);
        System.out.println(bankAccount2.getBalance());

    }
}

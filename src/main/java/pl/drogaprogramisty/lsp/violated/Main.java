package pl.drogaprogramisty.lsp.violated;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //LSP - Liskov Substitution Principle
        // Barbara Liskov.
        // parent - child
        // Bird - Pelikan (lata)
        // Bird -> Pingwin (nie lata)


        BankAccount bankAccount = new BankAccount(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getBalance());

        BankAccount bankAccount2
                = new FixedTermDepositAccount(100, 0.07);
        System.out.println(bankAccount2.getBalance());
        bankAccount2.withdraw(10); //exception

        List<BankAccount> bankAccounts = List.of(bankAccount, bankAccount2);
        for (BankAccount account : bankAccounts) {
            account.withdraw(1); //will throw exception for FixedTermDepositAccount and interrupts whole operation.
        }
    }
}

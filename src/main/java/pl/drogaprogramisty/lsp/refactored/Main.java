package pl.drogaprogramisty.lsp.refactored;

import java.util.List;

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

        List<String> immutableList = List.of();
        immutableList.add("element"); // it will throw an exception
        // BUT it's NOT a violation of LSP, because, according to documentation:
        // list.add - "Appends the specified element to the end of this list (**optional operation**)."
    }
}

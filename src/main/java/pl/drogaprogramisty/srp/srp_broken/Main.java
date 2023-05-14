package pl.drogaprogramisty.srp.srp_broken;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Łukasz", 5000, 4000),
                new Employee("Kuba", 5000, 4000),
                new Employee("Karolina", 5000, 4000)
        );
        MailSender mailSender = new MailSender();
        CompanyProfitCalculator companyProfitCalculator = new CompanyProfitCalculator(mailSender);
        CompanyProfit profit = companyProfitCalculator.calculate(employees, "drogaprogramisty@gmail.com");

        System.out.println(profit);
    }
}
package pl.drogaprogramisty.srp.srp_broken;

import java.util.List;

public class CompanyProfitCalculator {

    private final MailSender mailSender;

    public CompanyProfitCalculator(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public CompanyProfit calculate(List<Employee> employees, String email) {
        int totalIncome = 0;
        int totalExpenses = 0;

        for (Employee employee : employees) {
            totalIncome += employee.profit();
            totalExpenses += employee.salary();
        }

        CompanyProfit companyProfit = new CompanyProfit(totalIncome, totalExpenses, totalIncome - totalExpenses);
        mailSender.sendMail(companyProfit, email);
        return companyProfit;
    }
}

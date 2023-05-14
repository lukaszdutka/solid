package pl.drogaprogramisty.srp.base;

import java.util.List;

public class CompanyProfitCalculator {

    public CompanyProfit calculate(List<Employee> employees) {
        int totalIncome = 0;
        int totalExpenses = 0;

        for (Employee employee : employees) {
            totalIncome += employee.profit();
            totalExpenses += employee.salary();
        }

        return new CompanyProfit(totalIncome, totalExpenses, totalIncome - totalExpenses);
    }
}

package pl.drogaprogramisty.srp.srp_correct;

import java.util.List;

public class CompanyProfitCalculator {
    private final EmployeeSalaryCalculator employeeSalaryCalculator;

    public CompanyProfitCalculator(EmployeeSalaryCalculator employeeSalaryCalculator) {
        this.employeeSalaryCalculator = employeeSalaryCalculator;
    }

    public CompanyProfit calculate(List<Employee> employees) {
        double totalIncome = 0;
        double totalExpenses = 0;

        for (Employee employee : employees) {
            totalIncome += employee.profit();
            totalExpenses += employeeSalaryCalculator.calculateEmployeeSalary(employee);
        }

        return new CompanyProfit(totalIncome, totalExpenses, totalIncome - totalExpenses);
    }
}

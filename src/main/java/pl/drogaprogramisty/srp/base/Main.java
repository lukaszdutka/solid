package pl.drogaprogramisty.srp.base;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Łukasz", 5000, 4000),
                new Employee("Kuba", 5000, 4000),
                new Employee("Karolina", 5000, 4000)
        );
        CompanyProfitCalculator companyProfitCalculator = new CompanyProfitCalculator();
        CompanyProfit profit = companyProfitCalculator.calculate(employees);

        System.out.println(profit);
    }
}
package pl.drogaprogramisty.srp.srp_correct;

public class EmployeeSalaryCalculator {
    public double calculateEmployeeSalary(Employee employee) {
        return employee.salary() + 0.3 * employee.profit();
    }
}

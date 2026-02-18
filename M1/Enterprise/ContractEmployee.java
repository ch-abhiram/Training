package first.src.M1.Enterprise;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public ContractEmployee(int id, String name,
                            String dept,
                            double hourlyRate,
                            int hoursWorked)
            throws InvalidEmployeeException {

        super(id, name, dept, 0);

        if (hourlyRate <= 0)
            throw new InvalidEmployeeException("Hourly rate must be greater than 0");

        if (hoursWorked < 0)
            throw new InvalidEmployeeException("Hours worked cannot be negative");

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() throws InvalidSalaryException {
        return hourlyRate*hoursWorked;
    }
}

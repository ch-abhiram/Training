package first.src.M1.Enterprise;

public class FullTimeEmployee extends Employee{
    private double hra;
    private double bonus;
    public FullTimeEmployee(int id, String name,
                            String dept,
                            double baseSalary,
                            double hra,
                            double bonus)
            throws InvalidEmployeeException {

        super(id, name, dept, baseSalary);

        if (hra < 0)
            throw new InvalidEmployeeException("HRA cannot be negative");

        if (bonus < 0)
            throw new InvalidEmployeeException("Bonus cannot be negative");

        this.hra = hra;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() throws InvalidSalaryException {
        double gross = baseSalary+hra+bonus;
        double tax = applyTax(gross);
        return gross-tax;
    }

    protected double applyTax(double gross) {
        double tax = 0;

        if (gross <= 50000) {
            tax = gross * 0.05;
        }
        else if (gross <= 100000) {
            tax = (50000 * 0.05) + ((gross - 50000) * 0.10);
        }
        else {
            tax = (50000 * 0.05)
                    + (50000 * 0.10)
                    + ((gross - 100000) * 0.20);
        }

        return tax;
    }
}

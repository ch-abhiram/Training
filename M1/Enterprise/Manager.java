package first.src.M1.Enterprise;

public class Manager extends FullTimeEmployee{
    private double leadershipBonus;
    public Manager(int id, String name,
                   String dept,
                   double baseSalary,
                   double hra,
                   double bonus,
                   double leadershipBonus)
            throws InvalidEmployeeException {

        super(id, name, dept, baseSalary, hra, bonus);

        if (leadershipBonus < 0)
            throw new InvalidEmployeeException("Leadership bonus cannot be negative");

        this.leadershipBonus = leadershipBonus;
    }

    @Override
    public double calculateSalary() throws InvalidSalaryException {
        double salary = super.calculateSalary();
        return salary+leadershipBonus;
    }
}

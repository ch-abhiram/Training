package first.src.M1.Enterprise;

public abstract class Employee implements Comparable<Employee> {
    protected int id;
    protected String name;
    protected String department;
    protected double baseSalary;
    public Employee(int id, String name,
                    String department,
                    double baseSalary)
            throws InvalidEmployeeException {

        if (id <= 0)
            throw new InvalidEmployeeException("Invalid ID");

        if (name == null || name.trim().length() < 3)
            throw new InvalidEmployeeException("Name must have minimum 3 characters");

        if (department == null || department.trim().isEmpty())
            throw new InvalidEmployeeException("Department cannot be empty");

        if (baseSalary < 0)
            throw new InvalidEmployeeException("Base salary cannot be negative");

        this.id = id;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary()
            throws InvalidSalaryException;

    @Override
    public int compareTo(Employee other) {
        try {
            return Double.compare(
                    other.calculateSalary(),
                    this.calculateSalary());  // descending order
        } catch (InvalidSalaryException e) {
            return 0;
        }
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

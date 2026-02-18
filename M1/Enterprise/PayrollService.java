package first.src.M1.Enterprise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PayrollService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public double totalPayrollCost(){
        double res = employees.stream().mapToDouble(e->{
            try{
                return e.calculateSalary();
            }catch (InvalidSalaryException o){
                return 0;
            }
        }).sum();
        return res;
    }

    public List<Employee> top3HighestPaid(){
        return employees.stream().sorted().limit(3).collect(Collectors.toList());
    }
    public Map<String,Double> averageSalaryByDepartment(){
        return employees.stream().
                collect(Collectors.groupingBy(e->e.getDepartment(),
                        Collectors.averagingDouble(e->{
                            try{
                                return e.calculateSalary();
                            }catch (InvalidSalaryException o){
                                return 0;
                            }
                        })));
    }
    public void payrollReport(){
        System.out.println("Total payroll");
        System.out.println(totalPayrollCost());
        System.out.println("\n Department averages");
        Map<String,Double> avg = averageSalaryByDepartment();
        for(Map.Entry<String,Double> map:avg.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
        System.out.println("\nTop 3 Employees");
        top3HighestPaid().stream().forEach(System.out::println);
    }

}

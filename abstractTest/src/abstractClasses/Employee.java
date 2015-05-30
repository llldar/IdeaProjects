package abstractClasses;

/**
 * Created by Administrator on 2015/5/20.
 */
public class Employee extends Person{
    private double salary;
    private int hireMonth,hireDay,hireYear;
    public Employee(String name,double salary,int month,int day,int year){
        super(name);
        this.salary = salary;
        hireDay = day;
        hireMonth = month;
        hireYear = year;
    }

    @Override
    public String getDescription() {
        return "An Employee"
                + " who were hired in "+hireMonth+" "+hireDay+" "+hireYear
                + " and earning a salary of "+ salary;
    }
}

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/5/14.
 */
public class Employee {
    private String name;
    private double salary;
    private hireDate hireDay;

    public Employee(){
        name = "";
        salary = 0;
        hireDay = new hireDate();
    }

    public Employee(String name){
        this();
        this.name = name;
    }

    public Employee(String name,double salary,hireDate hireDay){
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setHireDay(String month) {
        this.hireDay = hireDay;
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String getHireDay() {
        return hireDay.toString();
    }
}



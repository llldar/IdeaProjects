/**
 * Created by Administrator on 2015/5/14.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(){
        super();
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }
}

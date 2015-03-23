/**
 * Created by Administrator on 2015/3/16.
 */
public class human {
    private int age;
    private boolean healthy;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "I'm "+ age + '\n'
                + "My name is " + name;
    }
}

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2015/3/16.
 */
public class Dog implements Lockable {
    String CurrentKey;

    private String name;
    private int age;

    public Dog(){
        name = "";
        age = 0;
    }

    public Dog(String name,int age) {
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String names) {
        name = names;
    }

    public int getAge() {
        return  age;
    }

    public void setAge(int ages) {
        age = ages;
    }

    public int getHumanAge() {
        return 7*age;
    }

    public String toString() {
        return "The dog age is: " + Integer.toString(age) +"\n"
              +"The dog name is: "+ name;
    }

    //The Lock methods
    public void setKey(String key){
        if(!isLocked()) {
            CurrentKey = key;
        }
        else {
            System.out.println("Please unlock first!");
        }
    }

    public void lock(String key) {
        if(!isLocked()){
            setKey(key);
        }
        else{
            System.out.println("It's already locked");
        }
    }

    public void unlock(String key){
        AtomicInteger times = new AtomicInteger(3);
        if (key.equals(CurrentKey)){
            CurrentKey = null;
        }
        else{
            System.out.println("PassWord incorrect, Please try again!");
            System.out.println("Times remains = " + times.get());
            times.getAndDecrement();
        }
    }

    public boolean isLocked(){
        if (CurrentKey == null)
            return false;
        else
            return true;
    }
}

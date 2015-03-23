/**
 * Created by Administrator on 2015/3/16.
 */
public class Kennel {


    public static void main(String arg[]) {
        Dog puppy = new Dog();
        puppy.setAge(2);
        puppy.setName("Nicky");
        Dog dodo = new Dog("dodo",3);
        System.out.println("The human age of " + dodo.getName() + " is: "
                + dodo.getHumanAge());
        System.out.println(dodo.toString());
    }



}

interface Lockable {
    void setKey(String key);
    void lock(String key);
    void unlock(String key);
    boolean isLocked();
}

package abstractClasses;

/**
 * Created by Administrator on 2015/5/20.
 */
abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public abstract String getDescription();

    public String getName() {
        return name;
    }
}

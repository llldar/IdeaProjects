package abstractClasses;

/**
 * Created by Administrator on 2015/5/20.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker",50000,10,1,1989);
        people[1] = new Student("Maria Morris","computer science");

        for (Person p: people)
            System.out.println(p.getName()+","+p.getDescription());
    }
}

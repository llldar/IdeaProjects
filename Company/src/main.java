import java.util.Scanner;

/**
 * Created by Administrator on 2015/5/14.
 */
public class main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Please input the number of your Employee:");
        number = in.nextInt();
        Employee[] Employees = new Employee[number];
        for (int i=0;i< number;i++){
            System.out.println("Please input the name of your Employee "+i+":");
            Employees[i].setName(in.nextLine());
            System.out.println("Please input the hire date of your Employee "+i+":");
            Employees[i].setHireDay(in.nextInt());
            System.out.println("Please input the salary of your Employee "+i+":");
        }
        for (int i=0;i< number;i++){
            System.out.println("Please input the name of your "+i+Employee "+i+":");
            Employees[i].setName(in.nextLine());
        }
    }
}

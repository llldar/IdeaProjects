/**
 * Created by Administrator on 2015/5/14.
 */
public class hireDate {
    private String year;
    private String month;
    private String day;

    public hireDate(){
        year = "1900";
        month = "Jan";
        day = "0";
    }

    public hireDate(String month,String year,String day){
        this.month = month;
        this.year = year;
        this.day = day;
    }

    @Override
    public String toString(){
        return month+day+year;
    }
}

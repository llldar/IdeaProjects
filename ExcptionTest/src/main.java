/**
 * Created by Administrator on 2015/3/16.
 */
public class main {
    public static void main(String[] args) {
        try {
            InputDeal id = new InputDeal("Hello hi god fuck123445643234234234234234234234");
        }catch (StringTooLongException exc) {
            System.out.println("The string is too long! "+exc);
        }
    }

}

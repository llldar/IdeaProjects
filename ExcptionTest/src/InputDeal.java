import java.util.IllegalFormatCodePointException;
import java.util.IllegalFormatException;

/**
 * Created by Administrator on 2015/3/16.
 */
class StringTooLongException extends Exception {


    public StringTooLongException() {
        super();

    }

    static NumberFormatException forInputString(String s) {
        return new NumberFormatException("For input string: \"" + s + "\"");
    }

}

public class InputDeal {
    StringTooLongException exception = new StringTooLongException();

    public InputDeal(String toBeDealt) throws StringTooLongException {

        if (toBeDealt.length() > 20) {
            throw exception;
        }
        else{
            System.out.println("The string is successfully dealt with!");
        }

    }
}



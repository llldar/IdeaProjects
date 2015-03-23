/**
 * Created by Administrator on 2015/3/14.
 */
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coin {

    public Coin() {
        Flip();
    }

    public static String Flip() {
        if((int)(Math.random() * 2) == 0){
            return "Head";
        }
        else
            return "Tail";
    }
}

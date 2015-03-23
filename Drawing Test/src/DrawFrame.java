/**
 * Created by Administrator on 2015/3/11.
 */
import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    public DrawFrame() {
        super("Drawing Test");
        setSize(480,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setLocationRelativeTo(null);
        DrawPanel dp = new DrawPanel();
        add(dp);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e) {
            System.err.println("Couldn't use system " +
                    "look and feel " + e);
        }
    }

    public static void main(String[] args ){
        DrawFrame df = new DrawFrame();
    }

}

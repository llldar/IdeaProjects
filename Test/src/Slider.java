/**
 * Created by Administrator on 2015/2/28.
 */
import java.awt.event.*;
import javax.swing.*;

public class Slider extends JFrame {

    public Slider() {
        super("Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JSlider pickNum = new JSlider(JSlider.HORIZONTAL,0,10,5);
        pickNum.setMajorTickSpacing(10);
        pickNum.setMinorTickSpacing(1);
        pickNum.setPaintTicks(true);
        pickNum.setPaintLabels(true);
        add(pickNum);
        pack();
        setVisible(true);
    }

        private void setLookAndFeel() {
            try{
                UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
                );
                SwingUtilities.updateComponentTreeUI(this);
            }catch (Exception exc) {
                System.out.println("Couldn't use the system "
                + "look and feel" + exc.getMessage());
            }
        }

    public static void main(String[] arg) {
        Slider frame = new Slider();
    }
}

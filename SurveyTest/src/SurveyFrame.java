import javax.swing.*;

/**
 * Created by Administrator on 2015/3/1.
 */
import java.awt.*;
import javax.swing.*;

public class SurveyFrame extends JFrame {
    public SurveyFrame() {
        super("Survey");
        setSize(290,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        SurveyWizard wiz = new SurveyWizard();
        add(wiz);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception exc) {
            System.out.println("Couldn't use " +
                    "the system look and feel "+ exc);
        }
    }

    public static void main(String[] args ) {
        SurveyFrame sf = new SurveyFrame();
    }
}

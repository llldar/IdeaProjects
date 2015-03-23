/**
 * Created by Administrator on 2015/3/3.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class confirmWindow extends JFrame implements ActionListener{

    public confirmWindow() {
        super("提示");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(150,70);
        GridLayout gl = new GridLayout(2,1);
        setLayout(gl);
        setLookAndFeel();
        JLabel confirmLabel = new JLabel("保存成功！");
        JButton confirmButton = new JButton("确定");
        add(confirmLabel);
        add(confirmButton);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception exc) {
            System.err.println("Couldn't use the" +
                    " system look and feel " +exc);
        }
    }


}

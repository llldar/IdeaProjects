import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Administrator on 2015/3/3.
 */
public class GridBagFrame extends JFrame implements ActionListener{
    JButton sendButton = new JButton("发送");
    JButton cancelButton = new JButton("取消");

    public GridBagFrame() {
        super("邮件系统");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,140);
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        setLookAndFeel();
        GridBagPanel gbl = new GridBagPanel();
        add(gbl);
        add(sendButton);
        add(cancelButton);
        setVisible(true);
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

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if(source ==  sendButton ){
            JOptionPane.showMessageDialog(null,
                    "发送成功!", "消息",
                    JOptionPane.WARNING_MESSAGE);
        } else if (source == cancelButton) {
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        GridBagFrame gbf = new GridBagFrame();
    }
}

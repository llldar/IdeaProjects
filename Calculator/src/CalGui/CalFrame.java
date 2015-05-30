package CalGui; /**
 * Created by Administrator on 2015/3/8.
 */
import javax.swing.*;
import java.awt.event.*;

public class CalFrame extends JFrame {

    public CalFrame() {
        super("计算器");
        setSize(240,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLookAndFeel();
        setLocationRelativeTo(null);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu editMenu = new JMenu("关于");
        menuBar.add(editMenu);
        final JMenuItem infoItem = new JMenuItem("版本信息");
        JMenuItem closeItem = new JMenuItem("退出");
        editMenu.add(infoItem);
        infoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(infoItem, "当前版本 —— v1.1", "版本", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        editMenu.add(closeItem);
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        CalPane cp = new CalPane();
        add(cp);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e) {
            System.err.println("Couldn't use the system" +
                    " look and feel! "+ e);
        }

    }

    public static void main(String[] args) {
        CalFrame calculator = new CalFrame();
    }
}

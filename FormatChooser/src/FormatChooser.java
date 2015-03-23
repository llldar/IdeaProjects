/**
 * Created by Administrator on 2015/3/3.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class FormatChooser extends JFrame implements ItemListener {
    String[] formats = { "(请选择)" , "小坏狗" ,"小可爱",
            "小萌狗","小贱狗", "小果果"};
    String[] descriptions = {
            "恭喜你答对了！",
            "你答对了！",
            "恭喜你答对了！",
            "恭喜你答对了！",
            "对不起你答错了！"
    };

    JComboBox formatBox = new JComboBox();
    JLabel descriptionLabel = new JLabel();

    public FormatChooser() {
        super("嘟嘟是什么？");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,240);
        setLookAndFeel();
        setLayout(new BorderLayout());
        for (int i = 0;i <formats.length;i++) {
            formatBox.addItem(formats[i]);
        }
        formatBox.addItemListener(this);
        add(BorderLayout.NORTH,formatBox);
        add(BorderLayout.CENTER,descriptionLabel);
        setVisible(true);

    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch(Exception exc) {
            System.err.println("Couldn't use the system" +
                    " look and feel. "+ exc);
        }
    }

    public void itemStateChanged(ItemEvent event) {
        int choice = formatBox.getSelectedIndex();
        if(choice > 0) {
            descriptionLabel.setText(descriptions[choice-1]);
        }
    }

    public Insets getInsets() {
        return new Insets(50,10,10,10);
    }

    public static void main(String[] args) {
        FormatChooser fc = new FormatChooser();
    }
}

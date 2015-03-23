/**
 * Created by Administrator on 2015/3/1.
 */
import javax.swing.*;
import java.awt.event.*;

public class Subscriptions extends JFrame {
    String[] subs = { "HELLO", "HI", "HOW ARE YOU", "I'M FINE",
    "HEHE", "HAHA", "DAMN", "BABE", "SORRY"};
    JList subList = new JList(subs);

    public Subscriptions() {
        super("Subscriptions");
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel sublabel = new JLabel("Rss Subscriptions");
        panel.add(sublabel);
        JButton leftButton = new JButton("Next");
        JButton rightButton = new JButton("Cancel");
        subList.setVisible(true);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);
        panel.add(leftButton);
        panel.add(rightButton);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch (Exception exc) {
            System.out.println("Couldn't use the system "
                    + "look and feel" + exc.getMessage());
        }
    }

    public static void main(String[] args) {
        Subscriptions.setLookAndFeel();
        Subscriptions sb = new Subscriptions();
    }


}

/**
 * Created by Administrator on 2015/3/1.
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements FocusListener {
    JTextField value1,value2,sum;
    JLabel plus,equals;

    public Calculator() {
        super("Add two numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        //create components
        value1 = new JTextField("0",5);
        value2 = new JTextField("0",5);
        plus = new JLabel("+");
        equals = new JLabel("=");
        sum = new JTextField("0",5);
        //addListeners
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        //set up sum field
        sum.setEditable(false);
        //add components
        add(value1);
        add(plus);
        add(value2);
        add(equals);
        add(sum);
        pack();
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception exc){
            System.err.println("Couldn't use the" +
                    " system look and feel "+ exc);
        }
    }

    public void focusGained(FocusEvent event) {
        try{
            float total = Float.parseFloat(value1.getText()) +
                Float.parseFloat(value2.getText());
            sum.setText(""+ total);
        }catch (NumberFormatException nfe) {
            value1.setText("0");
            value2.setText("0");
            sum.setText("0");
        }
    }

    public void focusLost(FocusEvent event) {
        focusGained(event);
    }

    public static void main(String[] args) {
        Calculator cc = new Calculator();
    }
}

package CalGui; /**
 * Created by Administrator on 2015/3/8.
 */

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import java.awt.*;
import java.awt.event.*;

class lastNumber<T>{
    private T LastNumber;
    public void setLastNumber(T number){
        LastNumber = number;
    }

    public T getLastNumber(){
        return LastNumber;
    }
}

public class CalPane extends JPanel {
    GridBagLayout gb = new GridBagLayout();

    public CalPane() {
        super();
        setLayout(gb);
        final JTextField expDisplay = new JTextField();
        final JTextField numDisplay = new JTextField();
        expDisplay.setHorizontalAlignment(JTextField.RIGHT);
        expDisplay.setEditable(false);
        numDisplay.setHorizontalAlignment(JTextField.RIGHT);
        numDisplay.setEditable(false);
        JButton[] numbers = new JButton[10];
        for (int i = 0;i <10;i++){
            numbers[i] = new JButton(Integer.toString(i));
        }
        for (int i =0;i<10;i++){
            final String currentNumber = Integer.toString(i);
            numbers[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numDisplay.setText(numDisplay.getText()+currentNumber);
                }
            });
        }

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton division = new JButton("/");
        JButton doubleZero = new JButton("00");
        JButton dot = new JButton(".");
        JButton leftBracket = new JButton("(");
        JButton rightBracket = new JButton(")");
        JButton equals = new JButton("=");
        JButton clear = new JButton("AC");

        ActionListener plusListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expDisplay.setText(numDisplay.getText()+"+");
                boolean toStart = true;
            }
        };

        ActionListener minusListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ActionListener multiplyListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ActionListener divisionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ActionListener leftBracketListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        ActionListener rightBracketListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        ActionListener dotListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        ActionListener equalsListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        ActionListener clearListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expDisplay.setText("");
                numDisplay.setText("");
//                lastNumber.setLastNumber(0);
            }
        };



        addComponent(expDisplay, 0, 0, 4, 1, 100, 100,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(numDisplay, 0, 1, 4, 1, 100, 100,
                GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(clear, 0, 2, 1, 1, 25, 100,
                GridBagConstraints.NONE, GridBagConstraints.CENTER);
        addComponent(leftBracket, 1, 2, 1, 1, 25, 100,
                GridBagConstraints.NONE, GridBagConstraints.CENTER);
        addComponent(rightBracket, 2, 2, 1, 1, 25, 100,
                GridBagConstraints.NONE, GridBagConstraints.CENTER);
        addComponent(division,3,2,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);

        addComponent(numbers[7],0,3,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(numbers[8],1,3,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(numbers[9],2,3,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(multiply,3,3,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);

        addComponent(numbers[4],0,4,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(numbers[5],1,4,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(numbers[6],2,4,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(minus,3,4,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);

        addComponent(numbers[1],0,5,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(numbers[2],1,5,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(numbers[3],2,5,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(plus,3,5,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);

        addComponent(numbers[0],0,6,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(doubleZero,1,6,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(dot,2,6,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
        addComponent(equals,3,6,1,1,25,100,
                GridBagConstraints.NONE,GridBagConstraints.CENTER);
    }

    private void addComponent(Component component, int gridx, int gridy,
        int gridwidth, int gridheight, int weightx,int weighty,
        int fill, int anchor) {

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = fill;
        constraints.anchor = anchor;
        gb.setConstraints(component,constraints);
        add(component);
    }

}
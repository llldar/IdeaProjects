import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2015/3/14.
 */
public class CoinGUI extends JFrame {
    public CoinGUI() {
        super("Coin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220,320);
        setLookAndFeel();
        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);
        setLocationRelativeTo(null);
        JTextArea headArea = new JTextArea("0");
        JTextArea tailArea = new JTextArea("0");
        final ImageIcon coinFace = new ImageIcon("C:\\Users\\Administrator\\Desktop\\Head.jpg");
        final ImageIcon coinTail = new ImageIcon("C:\\Users\\Administrator\\Desktop\\Tail.jpg");
        final JButton Coins = new JButton(coinFace);
        JButton flip = new JButton("Flip");
        flip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Coin.Flip() == "Head" ){
                    Coins.setIcon(coinFace);
                }
                else if (Coin.Flip() == "Tail" ) {
                    Coins.setIcon(coinTail);
                }
            }
        });
        add(Coins,BorderLayout.CENTER);
        add(headArea,BorderLayout.EAST);
        add(flip,BorderLayout.SOUTH);
        add(tailArea,BorderLayout.EAST);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception exc){
            System.err.println("Couldn't use the system" +
                    " look and feel " + exc);
        }
    }

    private void addComponent(Component component,int gridx,int gridy,
                              int gridwidth,int gridheight,
                              int weightx, int weighty,
                              int anchor,int fill){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridheight = gridheight;
        constraints.gridwidth = gridwidth;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.anchor = anchor;
        constraints.fill = fill;
    }

    public static void main(String[] args) {
        CoinGUI CG = new CoinGUI();
    }
}

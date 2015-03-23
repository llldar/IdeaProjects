/**
 * Created by Administrator on 2015/3/3.
 */
import javax.swing.*;
import java.awt.*;

public class GridBagPanel extends JPanel {
    GridBagLayout gridBag = new GridBagLayout();

    public GridBagPanel() {
        GridBagConstraints constraints;
        setLayout(gridBag);

        JLabel senderLabel = new JLabel("发件人: ");
        JTextField sender = new JTextField();

        JLabel receiverLabel = new JLabel("收件人: ");
        JTextField receiver = new JTextField();

        JLabel contentLabel = new JLabel("内容: ");
        JTextField content = new JTextField();

        addComponent(senderLabel,0,0,1,20,100);
        setVisible(true);
    }

    private void addComponent(Component component,int gridx,int gridy,
                              int gridwidth,int gridheight,int weightx,int weighty,
                              int fill,int anchor) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.fill = fill;
        constraints.anchor = anchor;
        gridBag.setConstraints(component,constraints);
        add(component);
    }
}

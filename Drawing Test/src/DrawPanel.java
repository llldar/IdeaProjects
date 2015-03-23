/**
 * Created by Administrator on 2015/3/11.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawPanel extends JPanel{
    public DrawPanel() {
        super();
    }

    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D)comp;
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Line2D.Float ln = new Line2D.Float(15F,20F,15F,30F);
        Rectangle2D.Float rc = new Rectangle2D.Float(10F,10F,20F,20F);
        int x = getSize().width / 2;
        int y = getSize().height /2;
        String title = "Hello!";
        Font font = new Font("宋体",Font.BOLD,33);
        comp2D.drawString(title,x,y);
        comp2D.draw(ln);
        comp2D.draw(rc);
    }
}

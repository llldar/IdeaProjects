/**
 * Created by Administrator on 2015/3/9.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class TextFramePanel extends JPanel {
    String text;
    String fontName;

    public TextFramePanel(String text,String fontName){
        super();
        this.text = text;
        this.fontName = fontName;
    }

    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D)comp;
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font(fontName, Font.BOLD,56);
        FontMetrics metrics = getFontMetrics(font);
        comp2D.setFont(font);
        int x = (getSize().width - metrics.stringWidth(text)) / 2;
        int y = getSize().height / 2;
        comp2D.drawString(text,x,y);
    }
}

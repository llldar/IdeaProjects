/**
 * Created by Administrator on 2015/3/9.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFrame extends JFrame {

    public TextFrame(String text,String fontName) {
        super("文字输出测试");
        setSize(960,540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextFramePanel sf = new TextFramePanel(text,fontName);
        add(sf);
        setLookAndFeel();
        setVisible(true);
    }

    public static void main(String[] args) {
        if(args.length <1) {
            System.out.println("Usage: javaTextFrame message font");
            System.exit(-1);
        }
        TextFrame frame = new TextFrame("本文字用于测试","黑体");
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e) {
            System.err.println("Couldn't use the system " +
                    "look and feel "+ e );
        }
    }

}

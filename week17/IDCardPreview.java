package week17;
import javax.swing.*;
import java.awt.*;

public class IDCardPreview extends JFrame {
    public IDCardPreview() {
        setTitle("Student IDCard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String info= "<html><center>"
        + "<h2>Neharika Mainali</h2>"
                + "Module: Programming<br>"
          + "College: Islington College"
                + "</center></html>";

        JLabel label=new JLabel(info,SwingConstants.CENTER);
        add(label);
    }
    public static void main(String[] N) {
        new IDCardPreview().setVisible(true);
    }
}
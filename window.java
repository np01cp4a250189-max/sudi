import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class window extends JFrame
{
    public window() {
        
        setTitle("CS4001N1 Programming");
        setSize(400,500);
        
        JPanel panel= new JPanel();
        //panel.setBackground(Color.CYAN);
        panel.setBorder(BorderFactory.createTitledBorder("User Info"));
        
        JLabel label= new JLabel("Username: ");
        label.setBounds(50,50,100,30);
        
        JTextField txtField= new JTextField();
        txtField.setBounds(155,50,100,30);
        
        JButton btn= new JButton("Submit");
        btn.setBounds(50,90,100,30);
        btn.setBackground(new Color(255,200,0));
        btn.setForeground(Color.RED);
        
        panel.add(btn);
        panel.add(label);
        panel.add(txtField);
        
        panel.setLayout(null);
        
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String [] args){
        window wd= new window();
        wd.setVisible(true);
        
    }
}
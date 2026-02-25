package week17;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class qn2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn2 extends JFrame
{
    public qn2() {
        setTitle("Administration Announcement");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel= new JPanel();
        panel.setBounds(0,0, 400,200);
        panel.setBackground(new Color(176,210,255));
        add(panel);
        
        JLabel label= new JLabel("Welcome to Orientation Program");
        panel.add(label);
        label.setBounds(150,50,100,30);
        
        setResizable(false);
        
        
        
        
        
    }
    
    public static void main(String[] args){
        qn2 qn2=new qn2();
        qn2.setVisible(true);
        
    }
    
    
}
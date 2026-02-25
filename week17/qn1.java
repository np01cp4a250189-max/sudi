package week17;
import javax.swing.*;

/**
 * Write a description of class qn1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn1 extends JFrame
{
    public qn1 (){
        setTitle("Library Notice");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel= new JPanel();
        add(panel);
        JLabel label= new JLabel("Library Opens At 7:00 AM  ");
        panel.add(label);
        label.setBounds(150,50,100,30);
        
    }
    
    public static void main(String[] args){
        qn1 qn1= new qn1();
        qn1.setVisible(true);
    }
    
    
    
    
}
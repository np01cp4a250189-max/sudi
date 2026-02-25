package week17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class qn3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentWindow extends JFrame

{
    public StudentWindow() {
        setTitle("Student profile");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new StudentWindow().setVisible(true);
            }
        });
    }
}
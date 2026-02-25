package week17;


import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {
    public LoginWindow() {
        setTitle("Login");
        setSize(400, 300);
        setLayout(null); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(60,80,80,25);
        JTextField username=new JTextField();
        username.setBounds(150,80,150,25);
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150,140,100,30);
        loginBtn.setBackground(Color.GREEN);

        add(userLabel);
        add(username);
        add(loginBtn);
    }

    public static void main(String[] args) {
        new LoginWindow().setVisible(true);
    }
}

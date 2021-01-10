package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confirmButton;

    public Admin() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("Admin"))
                {
                    if (PasswordCorrect(passwordField1.getPassword()))
                        Dataview.main(null);
                }
            }
        });
    }

    public boolean PasswordCorrect(char[] inPassword)
    {
        char[] Password =  { 'A', 'd', 'm', 'i', 'n'};
        int Correct = 0;
        if (inPassword.length != Password.length)
        {
            return false;
        }
        for (int i = 0; i < Password.length; i = i + 1)
        {
            if (Password[i] != inPassword[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Admin");
        frame.setContentPane(new Admin().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

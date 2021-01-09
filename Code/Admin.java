import javax.swing.*;

public class Admin {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confirmButton;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Admin");
        frame.setContentPane(new Admin().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

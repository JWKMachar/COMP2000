import javax.swing.*;

public class CheckOut {
    private JPanel panel1;
    private JButton cashButton;
    private JTextField textField1;
    private JButton cardButton;
    private JButton ADMINButton;
    private JButton confirmButton;

    public CheckOut() {

    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("CheckOut");
        frame.setContentPane(new CheckOut().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


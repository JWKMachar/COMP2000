package Classes;

import javax.swing.*;

public class Receipt {

    private JPanel panel1;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Receipt");
        frame.setContentPane(new  Receipt().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

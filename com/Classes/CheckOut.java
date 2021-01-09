package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckOut {
    private JPanel panel1;
    private JButton cashButton;
    private JTextField textField1;
    private JButton cardButton;
    private JButton ADMINButton;
    private JButton confirmButton;
    private javax.swing.JScrollPane JScrollPane;

    public CheckOut() {

        ADMINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] args = null;
                Admin.main(args);
            }
        });
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args)
    {
        Stock ShopStock = new Stock();
        Main.LoadItems(ShopStock);

        JFrame frame = new JFrame("CheckOut");
        frame.setContentPane(new CheckOut().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void updateReciept()
    {

    }
}


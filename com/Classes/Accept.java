package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accept {
    private JButton confirmPaymentButton;
    private JPanel panel1;

    public Accept() {
        confirmPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = CheckOut.thisOrder.Length();
                for (int i = 0; i < length; i++) {
                    int ItemCode = Integer.parseInt(CheckOut.thisOrder.ReceiptCode.getItem(i));
                    CheckOut.ShopStock.Amount[ItemCode] =  CheckOut.ShopStock.Amount[ItemCode] - 1;
                }
                Main.pushData(CheckOut.ShopStock);
                Receipt.main(null);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Accept");
        frame.setContentPane(new Accept().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

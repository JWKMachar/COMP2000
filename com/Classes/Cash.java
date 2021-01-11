package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Cash {
    private JTextField textField1;
    public JLabel lblTotalCost;
    private JLabel lblChangeRequired;
    private JPanel panel1;
    private JButton confirmButton;
    private JButton loadButton;


    public Cash() {



        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double ChangeRequired = Double.parseDouble(textField1.getText()) - Double.parseDouble(lblTotalCost.getText());
                DecimalFormat df = new DecimalFormat("#.00");
                String ChangeRequiredDF = df.format(ChangeRequired);
                lblChangeRequired.setText(String.valueOf(ChangeRequiredDF));

                int length = CheckOut.thisOrder.Length();
                for (int i = 0; i < length; i++) {
                    int ItemCode = Integer.parseInt(CheckOut.thisOrder.ReceiptCode.getItem(i));
                    CheckOut.ShopStock.Amount[ItemCode] =  CheckOut.ShopStock.Amount[ItemCode] - 1;
                }
                Main.pushData(CheckOut.ShopStock);
                Receipt.main(null);
            }

        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Total = 0.0;
                int length = CheckOut.thisOrder.Length();
                for (int i = 0; i < length; i++) {
                    int ItemCode = Integer.parseInt(CheckOut.thisOrder.ReceiptCode.getItem(i));
                    Total = Total + CheckOut.ShopStock.getItem(ItemCode).getPrice();
                }
                lblTotalCost.setText(String.valueOf(Total));
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Cash");
        frame.setContentPane(new Cash().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

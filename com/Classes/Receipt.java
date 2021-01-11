package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Receipt {

    private JPanel panel1;
    private JList list1;
    private JButton loadButton;

    public Receipt() {
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int length = CheckOut.thisOrder.Length();
                for (int i = 0; i < length; i++) {
                    int ItemCode = Integer.parseInt(CheckOut.thisOrder.ReceiptCode.getItem(i));
                    String ItemName = CheckOut.ShopStock.getItem(ItemCode).Name;
                    double ItemPrice = CheckOut.ShopStock.getItem(ItemCode).Price;
                    String AddItem = ItemName + " " + ItemPrice;
                    list1.setListData(AddItem);

                }
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Receipt");
        frame.setContentPane(new  Receipt().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

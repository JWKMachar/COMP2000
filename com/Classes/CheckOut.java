package Classes;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckOut {
    public static CurrentOrder thisOrder = new CurrentOrder();
    public static Stock ShopStock = new Stock();
    private JPanel panel1;
    private JButton cashButton;
    public JTextField textField1;
    private JButton cardButton;
    private JButton ADMINButton;
    private JButton confirmButton;
    private JScrollPane ReceiptBox;
    public JList list1;
    private JTextField textField2;

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
                int inItemCode = Integer.parseInt(textField1.getText());
                if (ShopStock.checkItem(inItemCode)) {
                    Item newItem = ShopStock.getItem(inItemCode);
                    thisOrder.AddItem(newItem);
                    {
                        list1.setListData(thisOrder.Receipt.getItems());
                    }
                }
            }
        });
    }



    public static void main(String[] args)
    {

        Main.LoadItems(ShopStock);

        JFrame frame = new JFrame("CheckOut");
        frame.setContentPane(new CheckOut().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dataview {
    private JPanel panel1;
    private JLabel lbl;
    private JComboBox comboBox1;
    private JLabel lblCurrentStock;
    private JTextField textField1;
    private JButton confirmNewStockButton;
    private JButton LOADDATAButton;
    private JButton selectStockButton;

    public Dataview() {
        confirmNewStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        LOADDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < CheckOut.ShopStock.totalProducts; i = i + 1) {
                    comboBox1.addItem(CheckOut.ShopStock.Products[i].Name);
                }
            }
        });
        selectStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                lblCurrentStock.setText(String.valueOf(CheckOut.ShopStock.Amount[comboBox1.getSelectedIndex()]));
            }
        });
    }


    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Dataview");
        frame.setContentPane(new Dataview().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

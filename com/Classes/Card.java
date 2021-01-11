package Classes;

import javax.swing.*;

public class Card {
    private JPanel panel1;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Card");
        frame.setContentPane(new Card().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

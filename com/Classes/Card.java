package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card {
    private JPanel panel1;
    private JButton acceptButton;
    private JButton declineButton;

    public Card() {
        acceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Accept.main(null);
            }
        });
        declineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Decline.main(null);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Card");
        frame.setContentPane(new Card().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

package Classes;

import javax.swing.*;

public class Dataview {
    private JPanel panel1;
    private JLabel lbl;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Dataview");
        frame.setContentPane(new Dataview().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

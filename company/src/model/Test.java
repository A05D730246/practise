package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test frame = new Test();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 609, 507);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        cardPanel = new JPanel();
        cardPanel.setBounds(10, 10, 573, 448);
        contentPane.add(cardPanel);
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        JPanel card1 = new JPanel();
        cardPanel.add(card1, "card1");
        card1.setLayout(null);

        JButton button1 = new JButton("Switch to Card 2");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "card2");
            }
        });
        button1.setBounds(54, 231, 151, 73);
        card1.add(button1);

        JPanel card2 = new JPanel();
        cardPanel.add(card2, "card2");
        card2.setLayout(null);

        JButton button2 = new JButton("Switch to Card 1");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "card1");
            }
        });
        button2.setBounds(351, 218, 151, 73);
        card2.add(button2);

       // timeUpdater.startTimer();
    }
}

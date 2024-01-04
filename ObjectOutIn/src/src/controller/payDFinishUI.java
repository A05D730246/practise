package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Order;
import util.cal;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectInputStream;

public class payDFinishUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payDFinishUI frame = new payDFinishUI();
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
	public payDFinishUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(38, 26, 502, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JTextArea sumoutput = new JTextArea();
		sumoutput.setBounds(49, 78, 147, 238);
		panel.add(sumoutput);
		
		JTextArea payoutput = new JTextArea();
		payoutput.setBounds(236, 78, 200, 231);
		panel.add(payoutput);
		
		
		
		pay = new JTextField();
		pay.setBounds(340, 23, 96, 21);
		panel.add(pay);
		pay.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("金額");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ObjectInputStream ois=cal.readFile("/ABC/Order.txt");
				
				try {
					Order o=(Order) ois.readObject();
					sumoutput.setText("姓名:"+o.getName()+
							"\nlcd:"+o.getLcd()+
							"\nram:"+o.getRam()+
							"\nsum:"+o.getSum());
					
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(49, 22, 87, 23);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("找零");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ObjectInputStream ois=cal.readFile("/ABC/Order.txt");
				try {
					Order o=(Order) ois.readObject();
					int PAY=Integer.parseInt(pay.getText());
					
					payoutput.setText("找零="+(PAY-o.getSum())+"元");
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(236, 22, 87, 23);
		panel.add(btnNewButton_1);
	}

}

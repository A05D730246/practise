package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Order;
import util.cal;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class addOrderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField lcd;
	private JTextField ram;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addOrderUI frame = new addOrderUI();
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
	public addOrderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(31, 50, 457, 364);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setBounds(46, 87, 46, 15);
		panel.add(lblNewLabel);
		
		JLabel lblLcd = new JLabel("lcd");
		lblLcd.setBounds(46, 125, 46, 15);
		panel.add(lblLcd);
		
		JLabel lblRam = new JLabel("ram");
		lblRam.setBounds(46, 161, 46, 15);
		panel.add(lblRam);
		
		name = new JTextField();
		name.setBounds(163, 84, 96, 21);
		panel.add(name);
		name.setColumns(10);
		
		lcd = new JTextField();
		lcd.setBounds(163, 122, 96, 21);
		panel.add(lcd);
		lcd.setColumns(10);
		
		ram = new JTextField();
		ram.setBounds(163, 158, 96, 21);
		panel.add(ram);
		ram.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				int Lcd=Integer.parseInt(lcd.getText());
				int Ram=Integer.parseInt(ram.getText());
				Order o=new Order(Name,Lcd,Ram);
				
				ObjectOutputStream oos=cal.addFile("/ABC/Order.txt");
				try {
					oos.writeObject(o);
					finishUI f=new finishUI();
					f.setVisible(true);
					dispose();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(163, 225, 87, 23);
		panel.add(btnNewButton);
	}

}

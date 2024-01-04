package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUI frame = new loginUI();
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
	public loginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(36, 33, 352, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setBounds(46, 96, 46, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setBounds(46, 135, 46, 15);
		panel.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBounds(115, 93, 96, 21);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(115, 132, 96, 21);
		panel.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Username=username.getText();
				String Password=password.getText();
				
				if(Username.equals("abc")&&Password.equals("1234") )
				{
					addOrderUI a=new addOrderUI();
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(115, 215, 87, 23);
		panel.add(btnNewButton);
	}
}

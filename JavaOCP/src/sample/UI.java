package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 455, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(32, 10, 376, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("會員資料");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 16));
		lblNewLabel.setBounds(146, 10, 70, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 0));
		panel_1.setBounds(32, 72, 376, 122);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1.setBounds(66, 25, 46, 18);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("地址");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(66, 53, 46, 18);
		panel_1.add(lblNewLabel_1_1);
		
		name = new JTextField();
		name.setBounds(146, 24, 96, 21);
		panel_1.add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setBounds(146, 52, 96, 21);
		panel_1.add(address);
		address.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(32, 204, 376, 221);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		/*******************************/
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 22, 292, 162);
		panel_2.add(scrollPane);
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		
		/**********************************************/
		JButton btnNewButton = new JButton("確定");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 user u=new user(name.getText(),address.getText());
			 
			 try {
				FileOutputStream fos=new FileOutputStream("user.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(u);
				
				memberUI m=new memberUI();
				m.setVisible(true);
				dispose();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(98, 81, 174, 23);
		panel_1.add(btnNewButton);
	}
}

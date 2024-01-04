package porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.porderDaoImpl;
import model.porder;
import util.button;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class addPorderUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField mouse;
	private JTextField ram;
	private JTextField lcd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addPorderUI frame = new addPorderUI();
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
	public addPorderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel.setBounds(32, 23, 68, 35);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(137, 23, 257, 35);
		contentPane.add(name);
		name.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("微软雅黑", Font.BOLD, 15));
		textArea.setBounds(34, 213, 360, 130);
		contentPane.add(textArea);
		
		JLabel lblLcd = new JLabel("Lcd:");
		lblLcd.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblLcd.setBounds(34, 68, 66, 35);
		contentPane.add(lblLcd);
		
		JLabel lblRam = new JLabel("ram:");
		lblRam.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblRam.setBounds(34, 113, 66, 35);
		contentPane.add(lblRam);
		
		JLabel lblMouse = new JLabel("Mouse:");
		lblMouse.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblMouse.setBounds(34, 158, 102, 35);
		contentPane.add(lblMouse);
		
		mouse = new JTextField();
		mouse.setColumns(10);
		mouse.setBounds(137, 158, 257, 35);
		contentPane.add(mouse);
		
		ram = new JTextField();
		ram.setColumns(10);
		ram.setBounds(137, 113, 257, 35);
		contentPane.add(ram);
		
		lcd = new JTextField();
		lcd.setColumns(10);
		lcd.setBounds(137, 68, 257, 35);
		contentPane.add(lcd);
		
		JButton btnNewButton = new JButton("新增");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				porder p = new porder(name.getText(),				Integer.parseInt(lcd.getText()),
						Integer.parseInt(ram.getText()),
						Integer.parseInt(mouse.getText()));
		new porderDaoImpl().add(p);			
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton.setBounds(34, 372, 87, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button.porderManager();
				dispose();
				
				
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1.setBounds(307, 372, 87, 35);
		contentPane.add(btnNewButton_1);
		
		
	}
}

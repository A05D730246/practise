package controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.memberDaoImpl;
import model.login;
import model.member;
import util.button;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class loginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Username;
	private JTextField password;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUI frame = new loginUI();
					frame.setUndecorated(true);
		            //frame.pack();
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
		setAlwaysOnTop(true);
		setBounds(100, 100, 780, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("灶下房");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 55));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 766, 127);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號  :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1.setBounds(69, 147, 185, 67);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("密碼  :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(69, 246, 185, 67);
		contentPane.add(lblNewLabel_1_1);
		
		Username = new JTextField();
		Username.setFont(new Font("微软雅黑", Font.BOLD, 30));
		Username.setBounds(308, 159, 379, 55);
		contentPane.add(Username);
		Username.setColumns(10);
		
		Password = new JPasswordField();
		Password.setFont(new Font("微软雅黑", Font.BOLD, 30));
        Password.setColumns(10);
        Password.setBounds(308, 258, 379, 55);
        contentPane.add(Password);
		
		JButton btnNewButton = new JButton("登入");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String USERNAME=Username.getText();
				String PASSWORD=Password.getText();
				
				member m=new memberDaoImpl().queryMember(USERNAME, PASSWORD);
				
				if(m!=null)
				{
					menuUI success=new menuUI();
					success.setUsername(USERNAME);
					success.setVisible(true);
					dispose();
				}
				else
				{
					String user = Username.getText();
					String password = Password.getText();
					login g = new login();
					String[] options = {"確定"};
					JOptionPane.showOptionDialog(contentPane,g.message(user, password),"會員登入",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, "確定");	
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton.setBounds(59, 380, 172, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("註冊");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addMemberUI success=new addMemberUI();
				success.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1.setBounds(308, 380, 172, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("離開");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("微软雅黑", Font.BOLD, 40));
		btnNewButton_1_1.setBounds(545, 380, 172, 61);
		contentPane.add(btnNewButton_1_1);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(0, 0, 0));
		time.setFont(new Font("微软雅黑", Font.BOLD, 15));
		time.setHorizontalAlignment(SwingConstants.RIGHT);
		time.setBounds(495, 10, 261, 42);
		contentPane.add(time);
		util.clock timeUpdater = new util.clock(time);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(loginUI.class.getResource("/controller/images/背景圖2-800x500.gif")));
		lblNewLabel_2.setBounds(0, 0, 800, 500);
		contentPane.add(lblNewLabel_2);
		timeUpdater.startTimer();
	}
}
